package com.github.wenweihu86.raft.brpc;


import com.github.wenweihu86.raft.RaftNode;
import com.github.wenweihu86.raft.RaftOptions;
import com.github.wenweihu86.raft.StateMachine;
import com.github.wenweihu86.raft.proto.RaftConsensusServiceGrpc;
import com.github.wenweihu86.raft.proto.RaftConsensusServiceGrpc.RaftConsensusServiceBlockingStub;
import com.github.wenweihu86.raft.proto.RaftProto;
import com.github.wenweihu86.raft.proto.RaftProto.Server;
import com.github.wenweihu86.raft.proto.RaftProto.VoteRequest;
import com.github.wenweihu86.raft.proto.RaftProto.VoteResponse;
import com.github.wenweihu86.raft.service.RaftConsensusService;
import com.github.wenweihu86.raft.service.impl.RaftConsensusServiceImpl;
import com.google.protobuf.BlockingService;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.ServerBuilder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.lang.module.ModuleDescriptor.Builder;
import java.util.ArrayList;
import java.util.List;

public class RpcCommunicationTest {

    private io.grpc.Server rpcServer;
    private static final int PORT = 8080;

    @Before
    public void setup() {
        try {
            rpcServer=ServerBuilder.forPort(PORT)
            .addService(new RaftConsensusServiceImpl()).build().start();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @After
    public void stopServer() {
        rpcServer.shutdown();
    }

    //开启serverA的rpc服务端，开启serverB的rpc客户端。
    @Test
    public void startServerA(){

    }

    @Test
    public void testRpcBetweenServerAndServerB() {
        String hostB = "localhost";
        int portB = 8080;

        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(hostB, portB)
                .usePlaintext()
                .build();
        RaftConsensusServiceBlockingStub helloServiceBlockingStub = RaftConsensusServiceGrpc.newBlockingStub(managedChannel).withCompression("gzip");

        VoteRequest helloRequest = VoteRequest.newBuilder()
                .setTerm(2)
                .build();
            VoteResponse orderResponse = helloServiceBlockingStub.hello(helloRequest);
            System.out.println("收到响应: " + orderResponse.getTerm());
        managedChannel.shutdown();
        System.out.println("完美");
        System.out.println(orderResponse.getTerm());
        System.out.println(orderResponse);

    }
}
