package org.kata.java.commands;

import org.kata.java.birds.Bird;
import org.kata.java.exceptions.FlyException;

public class FlyCommand implements Command {

    Bird bird;

    public FlyCommand(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void exec() throws FlyException {
        this.bird.fly();
        throw new FlyException("fly");
    }
}
