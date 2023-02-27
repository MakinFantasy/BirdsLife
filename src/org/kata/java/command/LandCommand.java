package org.kata.java.command;

import org.kata.java.bird.Bird;
import org.kata.java.exception.LandException;

public class LandCommand implements Command{
    @Override
    public void exec(Bird bird) {
        bird.landDown();
        throw new LandException("Land down exception..");
    }
}
