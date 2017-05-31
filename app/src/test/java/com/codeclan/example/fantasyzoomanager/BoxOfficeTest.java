package com.codeclan.example.fantasyzoomanager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/29/17.
 */
public class BoxOfficeTest {

    Visitor visitor;

    @Before
    public void before() {

        visitor = new Visitor("Daniel", "m");

    }

    @Test
    public void boxOfficeExists() {
        BoxOffice boxoffice = new BoxOffice();
        assertNotNull(boxoffice);
    }

    @Test
    public void addVistorToPark() {
        BoxOffice boxoffice = new BoxOffice();
        boxoffice.addVisitor(visitor);
        assertEquals(1, boxoffice.totalVisitors());
    }

    @Test
    public void dailyTakings() {
        BoxOffice boxoffice = new BoxOffice();
        boxoffice.addVisitor(visitor);
        assertEquals(7, boxoffice.totaltakings());
    }

}