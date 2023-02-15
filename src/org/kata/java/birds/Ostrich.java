package org.kata.java.birds;


import org.kata.java.status.Status;

public class Ostrich extends Bird{

    Status BirdStatus;

    @Override
    public void fly() {
        System.out.println("Ostrich is flying...");
        BirdStatus = Status.FLYING;
    }

    @Override
    public void die() {
        System.out.println("Ostrich dead...that's sad");
        BirdStatus = Status.DEAD;
    }

    @Override
    public void chill() {
        System.out.println("Ostrich has sat down on wire...");
        BirdStatus = Status.OnWIRES;
    }

    @Override
    public void landDown() {
        System.out.println("Ostrich has landed...");
        BirdStatus = Status.OnGROUND;
    }
}
