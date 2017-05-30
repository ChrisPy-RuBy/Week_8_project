package com.codeclan.example.fantasyzoomanager.Enclosures;


import com.codeclan.example.fantasyzoomanager.Creatures.Creature;
import com.codeclan.example.fantasyzoomanager.Creatures.Manticore;
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

    public String addCreature(Creature creature) {
        if ((creature.getHabitat()).equals(this.habitat)) {
            pen.add(creature);
            return "Creature added!";
        }
        return "Dont add that creature here";
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

    public String checkSex(Creature creature1, Creature creature2) {
        if ((creature1.getSex()).equals(creature2.getSex())) {
            return "Same sex";
        } else if ((creature1.getSex().equals("m") && (creature2.getSex().equals("f"))) || ((creature1.getSex().equals("f") && (creature2.getSex().equals("m"))))) {
            return "These two should get a room";
        }
        return "Lets see what happens!";
    }
}

