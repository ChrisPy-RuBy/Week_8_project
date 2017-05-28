package com.codeclan.example.fantasyzoomanager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class CreatureTest {

    Creature manticore;
    Creature leviathan;
    Feedable meat;
    Feedable fish;

    @Before
    public void before() {
        manticore = new Manticore("Troll");
        leviathan = new Leviathan("Swimmy");
        meat = new Meat();
        fish = new Fish();
    }

    @Test
    public void testObjectExists() {
        Creature creature = new Creature("Species");
        assertNotNull(creature);
    }

    @Test
    public void testCreatureHasPropertySpecies() {
        Creature creature = new Creature("Species");
        assertEquals("Species", creature.getName());
    }

    @Test
    public void testCreatureHasPropertyDifferentSpecies() {
        Creature creature = new Creature("Manticore");
        assertEquals("Manticore", creature.getName());
    }

    @Test
    public void testCreatureHasNoFood() {
        Creature creature = new Creature("Species");
        assertEquals(true, creature.beenFed());
    }

    @Test
    public void testCreatureHasFood() {
        manticore.feed(meat);
        assertEquals(false, manticore.beenFed());
    }

    @Test
    public void testInterfaceWithFoodTypes() {
        manticore.feed(meat);
        manticore.feed(fish);
        assertEquals(2, manticore.feedAmount());
    }

    @Test
    public void testInterfaceWithNonAbstractCreatures() {
        assertEquals("NOMNOMNOM", manticore.feed(meat));
    }

    @Test
    public void testInterfaceWithNonAbstractCreaturesAnotherCreature() {
        assertEquals("NOMNOMNOM", leviathan.feed(meat));
    }

}