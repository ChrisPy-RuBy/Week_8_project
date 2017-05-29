package com.codeclan.example.fantasyzoomanager;


import com.codeclan.example.fantasyzoomanager.Creatures.Creature;

import java.util.ArrayList;

/**
 * Created by mac on 5/28/17.
 */

public class Enclosure {

    private String name;
    private ArrayList<Creature> pen;
//    what is this doing,
    public Enclosure(String name) {
        this.name = name;
        this.pen = new ArrayList<Creature>();

    }

    public String getName() {
        return name;
    }

    public int numberOfCreaturesInEnclosure() {
        return pen.size();
    }

    public void addCreature(Creature creature) {
        pen.add(creature);
    }

    public void clearPen() {
        pen.clear();
    }

    public void remove(Creature creature) {
        pen.remove(creature);
    }
}

