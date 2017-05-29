package com.codeclan.example.fantasyzoomanager;

import com.codeclan.example.fantasyzoomanager.Creatures.Creature;
import com.codeclan.example.fantasyzoomanager.Creatures.Leviathan;
import com.codeclan.example.fantasyzoomanager.Creatures.Manticore;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class EnclosureTest {

    Enclosure enclosure;
    Creature manticore;
    Creature leviathan;

    @Before
    public void before() {
        enclosure = new Enclosure("murder room");
        manticore = new Manticore("Garry");
        leviathan = new Leviathan("bazzer");
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
        enclosure.addCreature(manticore);
        assertEquals(1, enclosure.numberOfCreaturesInEnclosure());
    }

    @Test
    public void enclosureHasMultipleCreatures() {
        enclosure.addCreature(manticore);
        enclosure.addCreature(leviathan);
        assertEquals(2, enclosure.numberOfCreaturesInEnclosure());
    }

    @Test
    public void  enclosureCanBeCleared() {
        enclosure.addCreature(manticore);
        enclosure.addCreature(leviathan);
        enclosure.clearPen();
        assertEquals(0, enclosure.numberOfCreaturesInEnclosure());
    }

    @Test
    public void specificCreatureCanBeRemovedFromPen() {
        enclosure.addCreature(manticore);
        enclosure.addCreature(leviathan);
        enclosure.remove(manticore);
        assertEquals(1, enclosure.numberOfCreaturesInEnclosure());
    }





}
