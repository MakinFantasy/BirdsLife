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

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.LogManager;
import java.io.FileInputStream;

public class ExceptionHandler {

    Command command;
    BirdCommandExecuter executer;
    Bird bird;
    Logger LOGGER;
    public ExceptionHandler (BirdCommandExecuter executer, Bird bird, Command command) {
        this.command = command;
        this.executer = executer;
        this.bird = bird;
        this.LOGGER = Logger.getLogger(this.getClass().getName());
        try (FileInputStream fileInputStream = new FileInputStream("logcfg.txt")){
            LogManager.getLogManager().readConfiguration(fileInputStream);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void handleException () {
        try {
            this.executer.executeOperation(this.command);
        } catch (ChillException e) {
            if (this.bird.getClass() == Ostrich.class) {
                System.out.println("Ostrich is too heavy to sit on wires, so....he's dead, yeah");
                this.bird.setStatus(Status.DEAD);
                this.LOGGER.log(Level.SEVERE, "Ostrich status: " + Status.DEAD);
            } else {
                this.bird.setStatus(Status.OnWIRES);
                this.LOGGER.log(Level.WARNING, this.bird.getClass().getName() + " status: " + Status.OnWIRES);
            }
        } catch (DieException e) {
            this.bird.setStatus(Status.DEAD);
            this.LOGGER.log(Level.SEVERE, this.bird.getClass().getName() + " status: " + Status.DEAD);
        } catch (FlyException e) {
            this.bird.setStatus(Status.FLYING);
            this.LOGGER.log(Level.INFO, this.bird.getClass().getName() + " status: " + Status.FLYING);
        } catch (LandingException e) {
            this.bird.setStatus(Status.OnGROUND);
            this.LOGGER.log(Level.INFO, this.bird.getClass().getName() + " status: " + Status.OnGROUND);
        }
    }

}
