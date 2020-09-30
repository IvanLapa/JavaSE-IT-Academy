package com.companyJD1.lecture7_oop;

public abstract class Hero {
    public String name;
    public Hero(String a) {
        this.name = a;
    }
    public String getName() {
        return this.name;
    }
    public abstract void attackEnemy (Enemy enemy);
}