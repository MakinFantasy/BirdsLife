package org.kata.java.commands;

import org.kata.java.birds.Bird;
import org.kata.java.exceptions.ChillException;

public class ChillCommand implements Command{

    private final Bird bird;

    public ChillCommand(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void exec() {
        this.bird.chill();
        throw new ChillException("chill");
    }
}
