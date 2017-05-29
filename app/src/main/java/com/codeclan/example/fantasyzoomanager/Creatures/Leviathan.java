package com.codeclan.example.fantasyzoomanager.Creatures;

import com.codeclan.example.fantasyzoomanager.Foods.Feedable;

import java.util.ArrayList;

/**
 * Created by mac on 5/28/17.
 */

public class Leviathan extends Creature {


    private ArrayList<Feedable> fed;

    public Leviathan(String name) {
        super(name);
        fed = new ArrayList<>();
    }

    public String feed(Feedable food) {
        fed.add(food);
        return "NOMNOMNOM";
    }
}
