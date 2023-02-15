package org.kata.java.commands;


import org.kata.java.exceptions.FlyException;

@FunctionalInterface
public abstract interface Command {
    public void exec() throws FlyException;
}
