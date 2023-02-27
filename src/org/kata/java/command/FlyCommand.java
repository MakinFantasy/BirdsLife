package org.kata.java.command;

import org.kata.java.bird.Bird;
import org.kata.java.exception.FlyException;

public class FlyCommand implements Command{
    @Override
    public void exec(Bird bird) {
        bird.fly();
        throw new FlyException("Fly exception");
    }
}
