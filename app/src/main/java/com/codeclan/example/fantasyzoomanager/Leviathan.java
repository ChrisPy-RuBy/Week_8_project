package com.codeclan.example.fantasyzoomanager;

import java.util.ArrayList;

/**
 * Created by mac on 5/28/17.
 */

public class Leviathan extends Creature implements Feedable {


    private ArrayList<Feedable> fed = new ArrayList<Feedable>();

    public Leviathan(String name) {
        super(name);
    }

    public String feed(Feedable food) {
        fed.add(food);
        return "NOMNOMNOM";
    }
}
