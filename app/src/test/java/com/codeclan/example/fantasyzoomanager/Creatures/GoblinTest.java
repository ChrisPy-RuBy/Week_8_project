package com.codeclan.example.fantasyzoomanager.Creatures;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/30/17.
 */
public class GoblinTest {


    @Test
    public void goblinExists() {
        Goblin goblin = new Goblin("SnozGlobler");
        assertNotNull(goblin);
    }


}