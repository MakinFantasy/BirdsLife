package org.kata.java.commands;

import org.kata.java.birds.Bird;
import org.kata.java.exceptions.DieException;

public class DieCommand implements Command{

    private final Bird bird;

    private DieCommand (Bird bird) {
        this.bird = bird;
    }
    @Override
    public void exec() {
        this.bird.die();
        throw new DieException("death");
    }
}
