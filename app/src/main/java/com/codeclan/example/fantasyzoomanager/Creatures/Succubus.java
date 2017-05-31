package com.codeclan.example.fantasyzoomanager.Creatures;

import com.codeclan.example.fantasyzoomanager.Foods.Feedable;
import com.codeclan.example.fantasyzoomanager.HabitatType;

import java.util.ArrayList;

/**
 * Created by mac on 5/30/17.
 */

public class Succubus extends Creature {


    public Succubus(String name) {
        super(name, HabitatType.DUNGEON);
    }


    public String getRoar() {
        return "Oh a man!";
    }

    public Creature makeBaby() {
        Succubus succubus = new Succubus("Tiffany");
        return succubus;
    }
}
