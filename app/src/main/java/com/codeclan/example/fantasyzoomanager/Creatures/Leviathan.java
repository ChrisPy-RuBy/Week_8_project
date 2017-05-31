package com.codeclan.example.fantasyzoomanager.Creatures;

import android.util.Log;

import com.codeclan.example.fantasyzoomanager.Foods.Feedable;
import com.codeclan.example.fantasyzoomanager.HabitatType;

import java.util.ArrayList;

/**
 * Created by mac on 5/28/17.
 */

public class Leviathan extends Creature {


    public Leviathan(String name) {
        super(name, HabitatType.DEEPOCEAN);
    }

    public String feed(Feedable food) {
        String foodType = food.foodType();
        if (foodType.equals("fish")) {
            return super.feed(food);
        } else if (foodType.equals("insects")) {
            return "Blergh!!!";
        }
        else {
            fed.add(food);
            return "Ok but I don't like it";
        }
    }

    public String getRoar() {
        return "screech";
    }

}
