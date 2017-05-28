package com.codeclan.example.fantasyzoomanager;

import java.util.ArrayList;

/**
 * Created by mac on 5/28/17.
 */

public class Creature {


    private String name;
    private ArrayList<Feedable> fed = new ArrayList<Feedable>();

    public Creature(String name) {
        this.name = name;
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




}
