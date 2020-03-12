package com.company.model.gladiators;

public abstract class Gladiator {
    protected int baseHP;
    protected int baseSP;
    protected int baseDex;
    protected int lvl = 1;
    protected String name;

    public Gladiator(String name){
        baseHP = (int)(Math.random()*100);
        baseSP = (int)(Math.random()*100);
        baseDex = (int)(Math.random()*100);

        this.name = name;
        sayHello();
    }

    public Gladiator(String name, int baseHP, int baseDex, int baseSP){
        this.baseHP = baseHP;
        this.baseSP = baseSP;
        this.baseDex = baseDex;

        this.name = name;
        sayHello();
    }

    public Gladiator(String name, int baseHP, int baseDex, int baseSP, int lvl){
        this.baseHP = baseHP;
        this.baseSP = baseSP;
        this.baseDex = baseDex;

        this.name = name;
        sayHello();
    }

    public Gladiator(){
        sayHello();
    }

    public abstract void attack();

    public void sayHello(){
        System.out.println("Hello, my name is " + name);
    }

    public int getBaseHP() {
        return baseHP;
    }

    public int getBaseSP() {
        return baseSP;
    }

    public int getBaseDex() {
        return baseDex;
    }

    public int getLvl() {
        return lvl;
    }

    public String getName() {
        return name;
    }
}
