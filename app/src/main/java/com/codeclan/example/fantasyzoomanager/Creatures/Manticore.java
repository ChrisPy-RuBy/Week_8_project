package com.codeclan.example.fantasyzoomanager.Creatures;

import com.codeclan.example.fantasyzoomanager.Foods.Feedable;

import java.util.ArrayList;

/**
 * Created by mac on 5/28/17.
 */

public class Manticore extends Creature {

    private ArrayList<Feedable> fed = new ArrayList<Feedable>();

    public Manticore(String name) {
        super(name);
    }

    public String feed(Feedable food) {
        String foodType = food.foodType();
        if (foodType.equals("meat")) {
            return super.feed(food);
        } else if (foodType.equals("fish")) {
            return "Blergh!!!";
        }
        return "Ok but I don't like it";
    }
}

