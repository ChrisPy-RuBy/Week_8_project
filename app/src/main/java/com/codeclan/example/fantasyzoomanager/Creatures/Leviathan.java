package com.codeclan.example.fantasyzoomanager.Creatures;

import com.codeclan.example.fantasyzoomanager.Foods.Feedable;
import com.codeclan.example.fantasyzoomanager.HabitatType;

import java.util.ArrayList;

/**
 * Created by mac on 5/28/17.
 */

public class Leviathan extends Creature {

    private ArrayList<Feedable> fed;

    public Leviathan(String name) {
        super(name, HabitatType.DEEPOCEAN);
        fed = new ArrayList<>();
    }

    public String feed(Feedable food) {
        String foodType = food.foodType();
        if (foodType.equals("fish")) {
            return super.feed(food);
        } else if (foodType.equals("insects")) {
            return "Blergh!!!";
        }
        return "Ok but I don't like it";
    }

//    public HabitatType getHabitat() {
//        return this.habitat;
//    }
}
