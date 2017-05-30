package com.codeclan.example.fantasyzoomanager;

import com.codeclan.example.fantasyzoomanager.Foods.Feedable;

import dalvik.annotation.TestTargetClass;

/**
 * Created by mac on 5/29/17.
 */

public class Visitor implements Feedable {

    private String name;

    public Visitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String foodType() {
        return "human";
    }
}
