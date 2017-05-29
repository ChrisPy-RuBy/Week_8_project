package com.codeclan.example.fantasyzoomanager.Creatures;

import com.codeclan.example.fantasyzoomanager.Creatures.Creature;
import com.codeclan.example.fantasyzoomanager.Creatures.Leviathan;
import com.codeclan.example.fantasyzoomanager.Creatures.Manticore;
import com.codeclan.example.fantasyzoomanager.Foods.Feedable;
import com.codeclan.example.fantasyzoomanager.Foods.Fish;
import com.codeclan.example.fantasyzoomanager.Foods.Meat;
import com.codeclan.example.fantasyzoomanager.HabitatType;

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
        manticore = new Manticore("Troll");
        assertNotNull(manticore);
    }

    @Test
    public void testCreatureHasPropertySpecies() {
        manticore = new Manticore("Troll");
        assertEquals("Troll", manticore.getName());
    }

    @Test
    public void testCreatureHasPropertyDifferentSpecies() {
        manticore = new Manticore("Troll");
        assertEquals("Troll", manticore.getName());
    }

    @Test
    public void testCreatureHasNoFood() {
        manticore = new Manticore("Troll");
        assertEquals(true, manticore.beenFed());
    }

    @Test
    public void testCreatureHasFood() {
        manticore.feed(meat);
        assertEquals(false, manticore.beenFed());
    }

    @Test
    public void testInterfaceWithFoodTypes() {
        manticore = new Manticore("Troll");;
        manticore.feed(meat);
        assertEquals(1, manticore.feedAmount());
    }

    @Test
    public void testInterfaceWithNonAbstractCreatures() {
        assertEquals("NOMNOMNOM", manticore.feed(meat));
    }

    @Test
    public void testInterfaceWithNonAbstractCreaturesAnotherCreature() {
        assertEquals("NOMNOMNOM", leviathan.feed(meat));
    }

    @Test
    public void giveHabitatType() {
        Assert.assertEquals(HabitatType.UNDERGROUND, manticore.getHabitat());
    }



}