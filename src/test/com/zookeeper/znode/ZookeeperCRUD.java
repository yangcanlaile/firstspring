package com.zookeeper.znode;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

public class ZookeeperCRUD {
    private String connectString = "zookeeper6:2181";
    private ZooKeeper zk = null;

    public ZookeeperCRUD() throws IOException {

        zk = new ZooKeeper(connectString, 3000, null);
        System.out.printf("已经连接上zookeeper");

    }

    public void CreateNode(String path, String data) throws KeeperException, InterruptedException {
        if (data == null) {
            data = "";
        }
        zk.create(path, data.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);


    }

}
