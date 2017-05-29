package com.codeclan.example.fantasyzoomanager;

import com.codeclan.example.fantasyzoomanager.Enclosures.Enclosure;
import com.codeclan.example.fantasyzoomanager.Enclosures.TheGoblinDen;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class ZooKeeperTest {

    TheGoblinDen thegoblinden;

    @Before
    public void before() {
        TheGoblinDen thegoblinden = new TheGoblinDen("murder room");
    }

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
        zookeeper.addEnclosureToZoo(thegoblinden);
        assertEquals(false, zookeeper.zooIsEmpty());
    }

}