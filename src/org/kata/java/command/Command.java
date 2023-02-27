package org.kata.java.command;

import org.kata.java.bird.Bird;

public interface Command {
    public void exec(Bird bird);
}
