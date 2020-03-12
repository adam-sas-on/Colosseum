package com.company.model;

import com.company.model.gladiators.Archer;
import com.company.model.gladiators.Gladiator;

import java.util.ArrayList;
import java.util.List;

public class Colosseum {
    List<Gladiator> gladiators;

    public Colosseum(){
        gladiators = new ArrayList<>();
        gladiators.add(new Archer("A") );
        gladiators.add(new Archer("B"));
    }

    public Colosseum(Gladiator gladiator1, Gladiator gladiator2){
        gladiators = new ArrayList<>(2);
        gladiators.add(gladiator1);
        gladiators.add(gladiator2);
    }
}
