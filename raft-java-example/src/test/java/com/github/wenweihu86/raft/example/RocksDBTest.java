package com.github.wenweihu86.raft.example;

import java.io.File;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.rocksdb.Checkpoint;
import org.rocksdb.Options;
import org.rocksdb.RocksDB;

import com.github.wenweihu86.raft.example.server.ExampleStateMachine;

public class RocksDBTest {

    static {
        RocksDB.loadLibrary();
    }

    private RocksDB db;

    @Test
    public void testGetAndSetState() throws Exception {
        String dataDir = "./testdata/rocksdb_data";
        // 判断是否存在目录
        File file = new File(dataDir);
        if (!file.exists()) {
            file.mkdirs();
        }

        Options options = new Options();
        options.setCreateIfMissing(true);
        db = RocksDB.open(options, dataDir);
        String keyStr = "key1";
        String valueStr = "value1";
        db.put(keyStr.getBytes(), valueStr.getBytes());

        String value = new String(db.get(keyStr.getBytes()), "UTF-8");
        System.out.println(value);
        Assert.assertEquals(valueStr, value);
        db.close();
    }

    @Test
    public void testInstallSnapShot() throws Exception {
        String snapshotDir = "./testdata/snapshot";

        db = RocksDB.open(new Options().setCreateIfMissing(true), "./testdata/rocksdb_data");

        Checkpoint checkpoint = Checkpoint.create(db);
        checkpoint.createCheckpoint(snapshotDir);
    }

    @Test
    public void restoreFromSnapShot() throws Exception {
        String snapshotDir = "./testdata/snapshot";
        String tagetDataDir="./testdata/rocksdb_data";
        //拷贝文件到rocksdb数据目录下
        File snapshotFile = new File(snapshotDir);
        if (snapshotFile.exists()) {
            FileUtils.copyDirectory(snapshotFile, new File(tagetDataDir));
        }

        Options options = new Options().setCreateIfMissing(true);
        db = RocksDB.open(options, tagetDataDir);
        // 测试数据是否恢复成功
        String keyStr = "key1";
        byte[] value = db.get(keyStr.getBytes());
        Assert.assertNotNull(value);
        System.out.println("获取值：" + new String(value, Charset.forName("UTF-8")));
        System.out.println("restore from snapshot success");
    }

}
