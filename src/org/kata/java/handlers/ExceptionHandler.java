package org.kata.java.handlers;

import org.kata.java.birds.Ostrich;
import org.kata.java.exec.BirdCommandExecuter;
import org.kata.java.birds.Bird;
import org.kata.java.commands.Command;
import org.kata.java.exceptions.ChillException;
import org.kata.java.exceptions.DieException;
import org.kata.java.exceptions.FlyException;
import org.kata.java.exceptions.LandingException;
import org.kata.java.status.Status;

import java.util.concurrent.ConcurrentMap;

public class ExceptionHandler {

    Command command;
    BirdCommandExecuter executer;
    Bird bird;
    public ExceptionHandler (BirdCommandExecuter executer, Bird bird, Command command) {
        this.command = command;
        this.executer = executer;
        this.bird = bird;
    }

    public void handleException () {
        try {
            this.executer.executeOperation(this.command);
        } catch (ChillException e) {
            if (this.bird.getClass() == Ostrich.class) {

                this.bird.BirdStatus = Status.DEAD;
            } else {
                this.bird.BirdStatus = Status.OnWIRES;
            }

        } catch (DieException e) {
            this.bird.BirdStatus = Status.DEAD;
        } catch (FlyException e) {
            this.bird.BirdStatus = Status.FLYING;
        } catch (LandingException e) {
            this.bird.BirdStatus = Status.OnGROUND;
        }
    }

}
