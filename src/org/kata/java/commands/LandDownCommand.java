package org.kata.java.commands;

import org.kata.java.birds.Bird;
import org.kata.java.exceptions.LandingException;

public class LandDownCommand implements Command{

    private final Bird bird;

    public LandDownCommand(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void exec() {
        this.bird.landDown();
        throw new LandingException("landed");
    }
}
