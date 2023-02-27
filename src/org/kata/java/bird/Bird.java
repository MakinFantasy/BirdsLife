package org.kata.java.bird;

import org.kata.java.command.Command;
import org.kata.java.status.BirdStatus;

import java.util.logging.Logger;

public abstract class Bird{
    BirdStatus status;
    public Bird () {
        this.status = BirdStatus.ALIVE;
    }

    public abstract void getStatus();
    public abstract void fly();
    public abstract void landDown();

    public abstract void chill();

    public abstract void die ();

    public abstract void handler(Command command);
}
