package com.codeclan.example.fantasyzoomanager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class EnclosureTest {

    Enclosure enclosure;
    Creature creature;
    Creature creature2;

    @Before
    public void before() {
        enclosure = new Enclosure("murder room");
        creature = new Creature("Species");
        creature2 = new Creature("Manticore");
//        why doesn't this work if enclosure has the object type infront of it?
    }

    @Test
    public void enclosureObjectExists() {
        Enclosure enclosure = new Enclosure("name");
        assertNotNull(enclosure);
    }

    @Test
    public void enclosureHasName() {
        Enclosure enclosure = new Enclosure("nameOfEnclosure");
        assertEquals("nameOfEnclosure", enclosure.getName());
    }

    @Test
    public void enclosureHasDifferentName() {
        assertEquals("murder room", enclosure.getName());
    }

    @Test
    public void enclosureHasAnimalContainerProperty() {
        assertEquals(0, enclosure.numberOfCreaturesInEnclosure());
    }

    @Test
    public void enclosureHasCreatureInIt() {
        enclosure.addCreature(creature);
        assertEquals(1, enclosure.numberOfCreaturesInEnclosure());
    }

    @Test
    public void enclusureHasMultipleCreatures() {
        enclosure.addCreature(creature);
        enclosure.addCreature(creature2);
        assertEquals(2, enclosure.numberOfCreaturesInEnclosure());
    }



}
