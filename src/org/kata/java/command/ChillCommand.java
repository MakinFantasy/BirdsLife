package org.kata.java.command;

import org.kata.java.bird.Bird;
import org.kata.java.exception.ChillException;

public class ChillCommand implements Command{
    @Override
    public void exec(Bird bird) {
        bird.chill();
        throw new ChillException("Chill exception");
    }
}
