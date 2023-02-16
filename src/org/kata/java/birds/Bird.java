package org.kata.java.birds;


import org.kata.java.status.Status;

import java.util.Stack;

public abstract class Bird {

    public Status BirdStatus;

    public abstract void fly ();

    public abstract void die ();

    public abstract void chill ();

    public abstract void landDown();

    public Status getStatus() {
        return this.BirdStatus;
    }


    public void setStatus(Status status) {
        this.BirdStatus = status;
    }
}
