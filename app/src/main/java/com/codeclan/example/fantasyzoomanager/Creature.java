package com.codeclan.example.fantasyzoomanager;

import java.util.ArrayList;

/**
 * Created by mac on 5/28/17.
 */

public class Creature {


    private String species;
    private ArrayList<Food> fed = new ArrayList<Food>();

    public Creature(String species) {
        this.species = species;


    }

    public String getSpecies() {
        return species;
    }

    public boolean beenFed() {
        return fed.isEmpty();
    }

    public void feed(Food food) {
        fed.add(food);
    }
}
