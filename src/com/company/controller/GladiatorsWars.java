package com.company.controller;

import com.company.model.Colosseum;
import com.company.model.gladiators.Archer;
import com.company.model.gladiators.Gladiator;

public class GladiatorsWars {

    public static void main(String[] args) {
        Colosseum colosseum = new Colosseum();

        Gladiator gladiator = new Archer("Adam");
        System.out.println(gladiator.getBaseHP());
    }
}
