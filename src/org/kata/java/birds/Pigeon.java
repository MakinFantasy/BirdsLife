package org.kata.java.birds;

import org.kata.java.status.Status;

public class Pigeon extends Bird{

    Status BirdStatus;

    @Override
    public void fly() {
        System.out.println("Pigeon is flying...");
        BirdStatus = Status.FLYING;
    }

    @Override
    public void die() {
        System.out.println("Pigeon dead...that's sad");
        BirdStatus = Status.DEAD;
    }

    @Override
    public void chill() {
        System.out.println("Pigeon has sat down on wire...");
        BirdStatus = Status.OnWIRES;
    }

    @Override
    public void landDown() {
        System.out.println("Pigeon has landed...");
        BirdStatus = Status.OnGROUND;
    }

    public Status getStatus () {
        return this.BirdStatus;
    }
}
