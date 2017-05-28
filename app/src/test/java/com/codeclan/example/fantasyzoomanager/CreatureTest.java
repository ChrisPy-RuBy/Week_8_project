package com.codeclan.example.fantasyzoomanager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class CreatureTest {




    @Test
    public void testObjectExists() {
        Creature creature = new Creature("Species");
        assertNotNull(creature);
    }

    @Test
    public void testCreatureHasPropertySpecies() {
        Creature creature = new Creature("Species");
        assertEquals("Species", creature.getSpecies());
    }

    @Test
    public void testCreatureHasPropertyDifferentSpecies() {
        Creature creature = new Creature("Manticore");
        assertEquals("Manticore", creature.getSpecies());
    }

//    @Test
//    public void testCreatureHasPropertyFood() {
//        Creature creature = new Creature("Species");
//
//    }
}