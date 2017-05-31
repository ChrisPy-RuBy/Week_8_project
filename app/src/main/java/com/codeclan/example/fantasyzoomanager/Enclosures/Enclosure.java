package com.codeclan.example.fantasyzoomanager.Enclosures;


import com.codeclan.example.fantasyzoomanager.Creatures.Creature;
import com.codeclan.example.fantasyzoomanager.Creatures.Manticore;
import com.codeclan.example.fantasyzoomanager.Foods.Feedable;

import com.codeclan.example.fantasyzoomanager.HabitatType;

import java.util.ArrayList;

/**
 * Created by mac on 5/28/17.
 */

public class Enclosure {

    private HabitatType habitat;
    private ArrayList<Creature> pen;
    private String sexesInPen;
    private int femaleCounter;
    private int goblinCounter;

    //    what is this doing,
    public Enclosure(HabitatType habitat) {
        this.habitat = habitat;
        this.pen = new ArrayList<Creature>();
        this.sexesInPen = "";
        this.femaleCounter = 0;
        this.goblinCounter = 0;


    }

//    public String getName() {
//        return name;
//    }

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


    public String matingPairs() {
        ;
        for (Creature creature : pen) {
            sexesInPen += creature.getSex();
            {
                if ((creature.getSex().equals("f"))) {
                    femaleCounter += 1;
                } else if ((creature.getSex().equals("c"))) {
                    goblinCounter += 1;
                }
            }
        }
        return sexesInPen;
    }

    public boolean checkMatingString() {
        CharSequence sex1 = "m";
        CharSequence sex2 = "f";
        return (sexesInPen.contains(sex1) && sexesInPen.contains(sex2));
    }

    public int getNumberFemales() {
        return femaleCounter;
    }

    public void produceBabies(Creature creature) {
        for(int i=0; i<this.femaleCounter; i++) {
            pen.add(creature.makeBaby());
        }
    }


    public void creatureClone(Creature creature) {
        for(int i=0; i<this.goblinCounter; i++) {
            pen.add(creature.makeBaby());
        }

    }

//
    public void inticeMale( FeedableAndEnticable visitor, Creature creature) {
       if (visitor.getSex().equals("m")) {
            creature.feed(visitor);
            pen.add(creature.makeBaby());
        }
        else { creature.feed(visitor);
        }

        }

   }

