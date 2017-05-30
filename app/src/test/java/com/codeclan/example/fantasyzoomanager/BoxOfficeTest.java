package com.codeclan.example.fantasyzoomanager;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/29/17.
 */
public class BoxOfficeTest {


    @Test
    public void boxOfficeExists() {
        BoxOffice boxoffice = new BoxOffice();
        assertNotNull(boxoffice);
    }

    @Test
    public void addVistorToPark() {
        BoxOffice boxoffice = new BoxOffice();
        Visitor visitor = new Visitor("Garry");
        boxoffice.addVisitor(visitor);
        assertEquals(1, boxoffice.totalVisitors());
    }

    @Test
    public void dailyTakings() {
        BoxOffice boxoffice = new BoxOffice();
        Visitor visitor = new Visitor("Garry");
        boxoffice.addVisitor(visitor);
        assertEquals(7, boxoffice.totaltakings());
    }

}