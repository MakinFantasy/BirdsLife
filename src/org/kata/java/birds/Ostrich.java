package org.kata.java.birds;


import org.kata.java.status.Status;

public class Ostrich extends Bird{

    Status BirdStatus;

    @Override
    public void fly() {
        System.out.println("Ostrich is flying...");
    }

    @Override
    public void die() {
        System.out.println("Ostrich dead...that's sad");
    }

    @Override
    public void chill() {
        System.out.println("Ostrich has sat down on wire...");
    }

    @Override
    public void landDown() {
        System.out.println("Ostrich has landed...");
    }

    public Status getStatus () {
        return this.BirdStatus;
    }

    public void setStatus (Status status) {
        this.BirdStatus = status;
    }
}
