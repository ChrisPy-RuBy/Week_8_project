package com.codeclan.example.fantasyzoomanager.Creatures;

import com.codeclan.example.fantasyzoomanager.Creatures.Creature;
import com.codeclan.example.fantasyzoomanager.Creatures.Leviathan;
import com.codeclan.example.fantasyzoomanager.Creatures.Manticore;
import com.codeclan.example.fantasyzoomanager.Creatures.Succubus;
import com.codeclan.example.fantasyzoomanager.Foods.Feedable;
import com.codeclan.example.fantasyzoomanager.Foods.Fish;
import com.codeclan.example.fantasyzoomanager.Foods.Meat;
import com.codeclan.example.fantasyzoomanager.HabitatType;
import com.codeclan.example.fantasyzoomanager.Visitor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class CreatureTest {

    Creature manticore;
    Creature leviathan;
    Creature succubus;
    Feedable goblin;
    Feedable meat;
    Feedable fish;
    Feedable visitor;



    @Before
    public void before() {
        manticore = new Manticore("Troll", "m");
        leviathan = new Leviathan("Swimmy");
        succubus = new Succubus("suzy");
        goblin = new Goblin("SnozGlobler");
        visitor = new Visitor("Garry");
        meat = new Meat();
        fish = new Fish();
    }

//    BASICS

    @Test
    public void testObjectExists() {
        assertNotNull(manticore);
    }

    @Test
    public void testCreatureHasPropertySpecies() {
        assertEquals("Troll", manticore.getName());
    }

    @Test
    public void testCreatureHasPropertyDifferentSpecies() {
        assertEquals("Troll", manticore.getName());
    }

    @Test
    public void testCreatureHasRoar() {
        assertEquals("roar", manticore.getRoar());
    }

    @Test
    public void testLeviathanHasScreech() {
        assertEquals("screech", leviathan.getRoar());
    }

    @Test
    public void testSuccubusAsScreech() {
        assertEquals("Oh a man!", succubus.getRoar());
    }

//    FOOD TESTS

    @Test
    public void testCreatureHasNoFood() {
        assertEquals(true, manticore.beenFed());
    }

    @Test
    public void testCreatureHasFood() {
        manticore.feed(meat);
        assertEquals(false, manticore.beenFed());
    }

    @Test
    public void testInterfaceWithFoodTypes() {
        manticore.feed(meat);
        assertEquals(1, manticore.feedAmount());
    }


    @Test
    public void testInterfaceWithNonAbstractCreatures() {
        assertEquals("NOMNOMNOM", manticore.feed(meat));
    }

    @Test
    public void testInterfaceWithNonAbstractCreaturesAnotherCreature() {
        assertEquals("Ok but I don't like it", leviathan.feed(meat));
    }

    @Test
    public void testInterfaceWithNonAbstractCreaturesAnotherCreatureA() {
        leviathan.feed(fish);
        assertEquals(1, leviathan.feedAmount());
    }

    @Test
    public void testInterfaceWithNonAbstractCreaturesAnotherCreatureDingle() {
        leviathan.feed(meat);
        assertEquals(1, leviathan.feedAmount());
    }

    @Test
    public void goblinsAreBothCreaturesAndFeedible() {
        leviathan.feed(goblin);
        leviathan.feed(fish);
        assertEquals(2, leviathan.feedAmount());
    }

    @Test
    public void goblinsAreBothCreaturesAndFeedibleManticore() {
        manticore.feed(goblin);
        manticore.feed(meat);
        assertEquals(2, manticore.feedAmount());
    }

    @Test
    public void humansAreEdible() {
        manticore.feed(visitor);
        assertEquals(1, manticore.feedAmount());
    }

//    HABITAT

    @Test
    public void giveHabitatType() {
        Assert.assertEquals(HabitatType.UNDERGROUND, manticore.getHabitat());
    }



}