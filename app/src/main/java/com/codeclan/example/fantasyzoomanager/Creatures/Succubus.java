package com.codeclan.example.fantasyzoomanager.Creatures;

import com.codeclan.example.fantasyzoomanager.Foods.Feedable;
import com.codeclan.example.fantasyzoomanager.HabitatType;

import java.util.ArrayList;

/**
 * Created by mac on 5/30/17.
 */

public class Succubus extends Creature {

    private ArrayList<Feedable> fed;

    public Succubus(String name) {
        super(name, HabitatType.DUNGEON);
        fed = new ArrayList<>();
    }


    public String getRoar() {
        return "Oh a man!";
    }
}
