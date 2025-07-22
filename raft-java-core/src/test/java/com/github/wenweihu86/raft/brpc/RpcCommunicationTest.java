package com.github.wenweihu86.raft.brpc;

import com.baidu.brpc.client.BrpcProxy;
import com.baidu.brpc.client.RpcClient;
import com.baidu.brpc.client.RpcClientOptions;
import com.baidu.brpc.client.instance.Endpoint;
import com.baidu.brpc.server.RpcServer;
import com.github.wenweihu86.raft.RaftNode;
import com.github.wenweihu86.raft.RaftOptions;
import com.github.wenweihu86.raft.StateMachine;
import com.github.wenweihu86.raft.proto.RaftProto;
import com.github.wenweihu86.raft.proto.RaftProto.Server;
import com.github.wenweihu86.raft.proto.RaftProto.VoteRequest;
import com.github.wenweihu86.raft.service.RaftConsensusService;
import com.github.wenweihu86.raft.service.impl.RaftConsensusServiceImpl;
import com.google.protobuf.BlockingService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.ArrayList;
import java.util.List;

public class RpcCommunicationTest {

    private RpcClient rpcClient;

     private RpcServer rpcServer;

    @Before
    public void setup() {
        rpcServer=new RpcServer(8080);
        // List<Server> servers=new ArrayList();
        // com.github.wenweihu86.raft.proto.RaftProto.Endpoint endpoint=com.github.wenweihu86.raft.proto.RaftProto.Endpoint.newBuilder().setHost("127.0.0.1").setPort(8080).build();
        // Server serverA=Server.newBuilder().setEndpoint(endpoint).build();
        // servers.add(serverA);
        // RaftOptions raftOptions=new RaftOptions();
        // raftOptions.setDataDir("./test_data");
        // StateMachine stateMachine;
        // RaftNode raftNode=new RaftNode(raftOptions, servers,serverA,stateMachine);

        //注册服务
        RaftConsensusService raftConsensusService = new RaftConsensusServiceImpl();
        rpcServer.registerService(raftConsensusService);
        rpcServer.start();
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
        Endpoint endpoint = new Endpoint(hostB, portB);
        RpcClient rpcClient = new RpcClient(endpoint);
        assertNotNull(rpcClient);
        RaftConsensusService raftConsensusService = BrpcProxy.getProxy(rpcClient, RaftConsensusService.class);

        String message = "Hello";
        com.github.wenweihu86.raft.proto.RaftProto.VoteRequest.Builder builder = VoteRequest.newBuilder();
        builder.setTerm(1);
        builder.setServerId(1);
        VoteRequest voteRequest = builder.build();
        RaftProto.VoteResponse response = raftConsensusService.hello(voteRequest);
        System.out.println("完美");
        System.out.println(response.getTerm());
        System.out.println(response);

    }
}
