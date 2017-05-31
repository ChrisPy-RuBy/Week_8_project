package com.codeclan.example.fantasyzoomanager.Creatures;

import android.util.Log;

import com.codeclan.example.fantasyzoomanager.Foods.Feedable;
import com.codeclan.example.fantasyzoomanager.HabitatType;

import java.util.ArrayList;

/**
 * Created by mac on 5/28/17.
 */

public abstract class Creature {

    private HabitatType habitat;
    private String roar;
    private String name;
    protected ArrayList<Feedable> fed = new ArrayList<Feedable>();

    public Creature(String name, HabitatType habitat) {
        this.name = name;
        this.habitat = habitat;
        this.roar = "roar";

    }

    public ArrayList<Feedable> getFed() {
        return fed;
    }

    public String getName() {
        return name;
    }

    public boolean beenFed() {
        return fed.isEmpty();
    }

    public int feedAmount() {
        return fed.size();
    }

    public String feed(Feedable food) {
        fed.add(food);
        return "NOMNOMNOM";
    }

    public HabitatType getHabitat() {
        return this.habitat ;
    }

    public String getSex() {
        return "Nope";
    }

    public String getRoar() {
        return roar;
    }

    public String mate(Creature creature) {
        if ((creature.getSex().equals("f"))) {
            return "Can produce a baby";
        }
        return "This animal don't work like that";
    }

    public Creature makeBaby() {
        return null;
    }
}
