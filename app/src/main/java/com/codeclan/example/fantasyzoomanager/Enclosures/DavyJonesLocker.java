package com.codeclan.example.fantasyzoomanager.Enclosures;

import com.codeclan.example.fantasyzoomanager.HabitatType;

/**
 * Created by mac on 5/29/17.
 */

public class DavyJonesLocker extends Enclosure {


    private HabitatType habitat;

    public DavyJonesLocker(String name) {
        super(name, HabitatType.DEEPOCEAN);
    }
}

