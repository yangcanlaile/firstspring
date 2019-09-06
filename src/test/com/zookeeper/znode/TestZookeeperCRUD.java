package com.zookeeper.znode;
import org.apache.zookeeper.KeeperException;
import java.io.IOException;
public class TestZookeeperCRUD {

    public static void main(String[] args) throws KeeperException, InterruptedException, IOException {
        ZookeeperCRUD zcr = new ZookeeperCRUD();
        System.out.println("开始创建节点");
        if(zcr.exists("/canyang")){
            System.out.println("存在节点/canyang,开始进行删除。。");
            zcr.deleteNode("/canyang");
            System.out.println("删除节点成功");
        }
        zcr.CreateNode("/canyang", "tmp");

    }

}
