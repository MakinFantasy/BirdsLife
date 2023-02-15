package org.kata.java.exec;

import org.kata.java.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class BirdCommandExecuter {

    private final List<Command> commands
            = new ArrayList<>();

    public void executeOperation(Command command) {
        commands.add(command);
        command.exec();
    }
}
