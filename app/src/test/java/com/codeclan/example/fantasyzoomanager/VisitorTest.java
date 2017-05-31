package com.codeclan.example.fantasyzoomanager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/29/17.
 */
public class VisitorTest {

    Visitor visitor;
    Visitor visitor2;

    @Before
    public void before() {
         visitor = new Visitor("Daniel", "m");
         visitor2 = new Visitor("Suzan", "f");
    }

    @Test
    public void visitorExists() {
        assertNotNull(visitor);
    }

    @Test
    public void visitorHasName() {
        assertEquals("Daniel", visitor.getName());

    }
}