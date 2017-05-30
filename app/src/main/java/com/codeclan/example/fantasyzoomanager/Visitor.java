package com.codeclan.example.fantasyzoomanager;

import dalvik.annotation.TestTargetClass;

/**
 * Created by mac on 5/29/17.
 */

public class Visitor {

    private String name;

    public Visitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
