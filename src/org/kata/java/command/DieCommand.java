package org.kata.java.command;

import org.kata.java.bird.Bird;
import org.kata.java.exception.DieException;

public class DieCommand implements Command {
    @Override
    public void exec(Bird bird) {
        bird.die();
        throw new DieException("Die exception");
    }
}
