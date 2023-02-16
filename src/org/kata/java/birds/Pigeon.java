package org.kata.java.birds;

import org.kata.java.status.Status;

public class Pigeon extends Bird{

    Status BirdStatus;

    @Override
    public void fly() {
        System.out.println("Pigeon is flying...");
    }

    @Override
    public void die() {
        System.out.println("Pigeon dead...that's sad");
    }

    @Override
    public void chill() {
        System.out.println("Pigeon has sat down on wire...");
    }

    @Override
    public void landDown() {
        System.out.println("Pigeon has landed...");
    }

    public Status getStatus () {
        return this.BirdStatus;
    }

    public void setStatus (Status status) {
        this.BirdStatus = status;
    }
}
