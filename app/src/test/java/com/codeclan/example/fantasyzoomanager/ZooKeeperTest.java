package com.codeclan.example.fantasyzoomanager;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class ZooKeeperTest {

    @Test
    public void zooKeeperObjectExists() {
        ZooKeeper zookeeper = new ZooKeeper();
        assertNotNull(zookeeper);
    }

    @Test
    public void zooKeeperEnclosuresExist() {
        ZooKeeper zookeeper = new ZooKeeper();
        assertEquals(true, zookeeper.zooIsEmpty());
    }

    @Test
    public void zooKeeperAddEnclosureToZoo() {
        ZooKeeper zookeeper = new ZooKeeper();
        Enclosure enclosure = new Enclosure("murder room");
        zookeeper.addEnclosureToZoo(enclosure);
        assertEquals(false, zookeeper.zooIsEmpty());
    }

}