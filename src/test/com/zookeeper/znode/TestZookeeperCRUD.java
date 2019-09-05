package com.zookeeper.znode;

        import org.apache.zookeeper.KeeperException;

        import java.io.IOException;

public class TestZookeeperCRUD {

    public static void main(String[] args) throws KeeperException, InterruptedException, IOException {
        ZookeeperCRUD zcr = new ZookeeperCRUD();
        System.out.println("开始创建节点");
        zcr.CreateNode("/canyang", "tmp");
    }

}
