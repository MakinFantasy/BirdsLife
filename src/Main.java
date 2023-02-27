import org.kata.java.bird.Bird;
import org.kata.java.bird.Ostrich;
import org.kata.java.bird.Pigeon;
import org.kata.java.command.*;

import java.util.logging.Logger;

public class Main {
    public static void main (String[] args) {
        Command[] pigeonCommands = {
                new FlyCommand(),
                new ChillCommand(),
                new FlyCommand(),
                new LandCommand(),
                new DieCommand()
        };

        Command[] ostrichCommands = {
                new FlyCommand(),
                new LandCommand(),
                new FlyCommand(),
                new ChillCommand()
        };

        Bird pigeon = new Pigeon();

        for (Command command : pigeonCommands) {
            pigeon.handler(command);
        }

        Bird ostrich = new Ostrich();

        for (Command command : ostrichCommands) {
            ostrich.handler(command);
        }

    }
}
