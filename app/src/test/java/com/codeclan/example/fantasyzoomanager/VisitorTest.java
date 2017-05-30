package com.codeclan.example.fantasyzoomanager;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/29/17.
 */
public class VisitorTest {

    @Test
    public void visitorExists() {
        Visitor visitor = new Visitor("Derp");
        assertNotNull(visitor);
    }

    @Test
    public void visitorHasName() {
        Visitor visitor = new Visitor("Derp");
        assertEquals("Derp", visitor.getName());

    }
}