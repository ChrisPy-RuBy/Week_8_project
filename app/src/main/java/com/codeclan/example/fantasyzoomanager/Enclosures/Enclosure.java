package com.codeclan.example.fantasyzoomanager.Enclosures;


import com.codeclan.example.fantasyzoomanager.Creatures.Creature;
import com.codeclan.example.fantasyzoomanager.HabitatType;

import java.util.ArrayList;

/**
 * Created by mac on 5/28/17.
 */

public class Enclosure {

    private HabitatType habitat;
    private String name;
    private ArrayList<Creature> pen;
//    what is this doing,
    public Enclosure(String name, HabitatType habitat) {
        this.name = name;
        this.habitat = habitat;
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

    public HabitatType getHabitat() {
        return this.habitat;
    }
}

