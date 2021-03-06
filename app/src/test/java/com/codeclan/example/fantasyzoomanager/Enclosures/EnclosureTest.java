package com.codeclan.example.fantasyzoomanager.Enclosures;

import com.codeclan.example.fantasyzoomanager.Creatures.Creature;
import com.codeclan.example.fantasyzoomanager.Creatures.Goblin;
import com.codeclan.example.fantasyzoomanager.Creatures.Leviathan;
import com.codeclan.example.fantasyzoomanager.Creatures.Manticore;
import com.codeclan.example.fantasyzoomanager.Creatures.Succubus;
import com.codeclan.example.fantasyzoomanager.Enclosures.Enclosure;
import com.codeclan.example.fantasyzoomanager.Enclosures.TheDepthsOfHades;
import com.codeclan.example.fantasyzoomanager.Foods.Ambergris;
import com.codeclan.example.fantasyzoomanager.Foods.Feedable;
import com.codeclan.example.fantasyzoomanager.HabitatType;
import com.codeclan.example.fantasyzoomanager.Visitor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class EnclosureTest {

    Enclosure enclosure;
    Enclosure enclosure2;
    Enclosure enclosure3;
    Enclosure enclosure4;
    Creature manticore;
    Creature manticore2;
    Creature manticore3;
    Creature leviathan;
    Creature goblin;
    Creature succubus;
    FeedableAndEnticable visitor;
    FeedableAndEnticable visitor2;
    Feedable ambergris;




    @Before
    public void before() {
        enclosure = new TheDepthsOfHades();
        enclosure2 = new TheGoblinDen();
        enclosure3 = new DavyJonesLocker();
        enclosure4 = new SexDungeon();
        manticore = new Manticore("Garry", "m");
        manticore2 = new Manticore("Garry", "m");
        manticore3 = new Manticore("Garry", "f");
        leviathan = new Leviathan("bazzer");
        succubus = new Succubus("Mandy");
        goblin = new Goblin("Snozgrobler");
        visitor = new Visitor("Daniel", "m");
        visitor2 = new Visitor("Gill", "f");
        ambergris = new Ambergris();
//        why doesn't this work if enclosure has the object type infront of it?
    }

    @Test
    public void enclosureObjectExists() {
        assertNotNull(enclosure);
    }

//    @Test
//    public void enclosureHasName() {
//        assertEquals("murder room", enclosure.getName());
//    }
//
//    @Test
//    public void enclosureHasDifferentName() {
//        assertEquals("FUCK", enclosure2.getName());
//    }

    @Test
    public void enclosureHasAnimalContainerProperty() {
        assertEquals(0, enclosure.numberOfCreaturesInEnclosure());
    }

    @Test
    public void enclosureHasCreatureInIt() {
        enclosure3.addCreature(leviathan);
        assertEquals(1, enclosure3.numberOfCreaturesInEnclosure());
    }

//    @Test
//    public void enclosureHasMultipleCreatures() {
//        enclosure.addCreature(manticore);
//        enclosure.addCreature(leviathan);
//        assertEquals(2, enclosure.numberOfCreaturesInEnclosure());
//    }

    @Test
    public void enclosureCanBeCleared() {
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
        assertEquals(0, enclosure.numberOfCreaturesInEnclosure());
    }

    @Test
    public void enclosureTypeCheck() {
        assertEquals(HabitatType.HELLFIRE, enclosure.getHabitat());
    }

    @Test
    public void correctEnclosureAdded() {
        enclosure2.addCreature(manticore);
        assertEquals(1, enclosure2.numberOfCreaturesInEnclosure());
        enclosure2.addCreature(leviathan);
        assertEquals(1, enclosure2.numberOfCreaturesInEnclosure());
    }

    @Test
    public void correctEnclosureAddedWithMessage() {
        assertEquals("Creature added!", enclosure2.addCreature(manticore));
    }

    @Test
    public void incorrectEnclosureAddedWithMessage() {
        assertEquals("Dont add that creature here", enclosure2.addCreature(leviathan));
    }

    @Test
    public void correctMoreEnclosureAdded() {
        enclosure2.addCreature(manticore);
        enclosure2.addCreature(manticore);
        enclosure2.addCreature(manticore);
        assertEquals(3, enclosure2.numberOfCreaturesInEnclosure());
        enclosure2.addCreature(leviathan);
        assertEquals(3, enclosure2.numberOfCreaturesInEnclosure());
    }

    @Test
    public void correctMoreMoreEnclosureAdded() {
        enclosure2.addCreature(leviathan);
        assertEquals(0, enclosure2.numberOfCreaturesInEnclosure());
    }

    //    SEX TESTS
    @Test
    public void outputSexOfCreaturesInEnclosure() {
        assertEquals("Same sex", enclosure2.checkSex(manticore, manticore2));
    }

    @Test
    public void outputSexOfCreaturesInEnclosureDifferentSex() {
        assertEquals("These two should get a room", enclosure2.checkSex(manticore, manticore3));
    }

    @Test
    public void outputSexOfCreaturesInEnclosureMiscSex() {
        assertEquals("Lets see what happens!", enclosure2.checkSex(manticore, leviathan));
    }

    @Test
    public void containsSex() {
        enclosure2.addCreature(manticore);
        enclosure2.addCreature(manticore2);
        enclosure2.addCreature(manticore2);
        assertEquals("mmm", enclosure2.matingPairs());
    }

    @Test
    public void containsSexDifferentOrder() {
        enclosure2.addCreature(manticore);
        enclosure2.addCreature(manticore3);
        enclosure2.addCreature(manticore2);
        assertEquals("mfm", enclosure2.matingPairs());
    }

    @Test
    public void containsSexBoolean() {
        enclosure2.addCreature(manticore);
        enclosure2.addCreature(manticore3);
        enclosure2.addCreature(manticore2);
        enclosure2.matingPairs();
        assertEquals(true, enclosure2.checkMatingString());
    }

    @Test
    public void containsSexBooleanSausageFest() {
        enclosure2.addCreature(manticore);
        enclosure2.addCreature(manticore);
        enclosure2.addCreature(manticore);
        enclosure2.matingPairs();
        assertEquals(false, enclosure2.checkMatingString());
    }

    @Test
    public void numberOfFemales() {
        enclosure2.addCreature(manticore);
        enclosure2.addCreature(manticore3);
        enclosure2.addCreature(manticore2);
        enclosure2.matingPairs();
        assertEquals(1, enclosure2.getNumberFemales());
    }

    @Test
    public void getBabies() {
        enclosure2.addCreature(manticore);
        enclosure2.addCreature(manticore3);
        enclosure2.addCreature(manticore3);
        enclosure2.addCreature(manticore3);
        enclosure2.addCreature(manticore2);
        enclosure2.matingPairs();
        enclosure2.getNumberFemales();
        enclosure2.produceBabies(manticore2);
        assertEquals(8, enclosure2.numberOfCreaturesInEnclosure());
    }

//   Goblin cloning

    @Test
    public void cloneGoblins() {
        enclosure2.addCreature(goblin);
        enclosure2.matingPairs();
        enclosure2.creatureClone(goblin);
        assertEquals(2, enclosure2.numberOfCreaturesInEnclosure());

        }

    @Test
    public void goblinCloningCombinedMethods() {
        enclosure2.addCreature(goblin);
        enclosure2.addCreature(goblin);
        enclosure2.goblinBreed(goblin);
        assertEquals(4, enclosure2.numberOfCreaturesInEnclosure());
    }

//   Succubus raping and eating

    @Test
    public void inticeMale() {
        enclosure4.addCreature(succubus);
        enclosure4.inticeMale(visitor, succubus);
        assertEquals(2, enclosure4.numberOfCreaturesInEnclosure());
    }

    @Test
    public void inticeMaleAndEatFemale() {
        enclosure4.addCreature(succubus);
        enclosure4.inticeMale(visitor2, succubus);
        assertEquals(1, enclosure4.numberOfCreaturesInEnclosure());
    }


    @Test
    public void inticeMaleMoreTests() {
        enclosure4.addCreature(succubus);
        enclosure4.inticeMale(visitor, succubus);
        enclosure4.inticeMale(visitor, succubus);
        enclosure4.inticeMale(visitor, succubus);
        assertEquals(4, enclosure4.numberOfCreaturesInEnclosure());
    }

    @Test
    public void leviathanVomitsBabiesIntoEnclosure() {
        Leviathan leviathan = new Leviathan("Bazzers");
        enclosure3.addCreature(leviathan);
        leviathan.feed(ambergris);
        enclosure3.newBabiesToEnclosure(leviathan.getFed());
        assertEquals(6, enclosure3.numberOfCreaturesInEnclosure());
    }

    @Test
    public void leviathanVomitsBabiesIntoEnclosureSecond() {
        Leviathan leviathan = new Leviathan("Bazzers");
        enclosure3.addCreature(leviathan);
        leviathan.feed(ambergris);
        leviathan.feed(ambergris);
        enclosure3.newBabiesToEnclosure(leviathan.getFed());
        assertEquals(11, enclosure3.numberOfCreaturesInEnclosure());
    }


    }


