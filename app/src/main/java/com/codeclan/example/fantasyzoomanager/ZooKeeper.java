package com.codeclan.example.fantasyzoomanager;

import com.codeclan.example.fantasyzoomanager.Enclosures.Enclosure;

import java.util.ArrayList;

/**
 * Created by mac on 5/28/17.
 */

public class ZooKeeper {

    private ArrayList<Enclosure> enclosures;

    public ZooKeeper() {
        this.enclosures = new ArrayList<Enclosure>();
    }

    public boolean zooIsEmpty() {
        return enclosures.isEmpty();
    }

    public void addEnclosureToZoo(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

}



