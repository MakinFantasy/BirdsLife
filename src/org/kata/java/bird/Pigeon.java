package org.kata.java.bird;

import org.kata.java.command.Command;
import org.kata.java.exception.ChillException;
import org.kata.java.exception.DieException;
import org.kata.java.exception.FlyException;
import org.kata.java.exception.LandException;
import org.kata.java.status.BirdStatus;

import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Pigeon extends Bird{

    public void getStatus () {
        System.out.println("Pigeon status: " + this.status);
    }

    @Override
    public void fly() {
        System.out.println("Pigeon is flying");
    }

    @Override
    public void landDown() {
        System.out.println("Pigeon landed");
    }

    @Override
    public void chill() {
        System.out.println("Pigeon is on wires...");
    }

    @Override
    public void die() {
        System.out.println("Pigeon dead...");
    }

    @Override
    public void handler (Command command) {
        Logger logger = Logger.getLogger(this.getClass().getName());
        try (FileInputStream fileInputStream = new FileInputStream("logcfg.txt")){
            LogManager.getLogManager().readConfiguration(fileInputStream);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        try {
            command.exec(this);
        } catch (FlyException exception) {
            this.status = BirdStatus.FLYING;
            this.getStatus();
            logger.log(Level.INFO, "Pigeon status - FLYING");
        } catch (DieException exception) {
            this.status = BirdStatus.DEAD;
            this.getStatus();
            logger.log(Level.INFO, "Pigeon status - DEAD");
        } catch (ChillException exception) {
            this.status = BirdStatus.OnWIRES;
            this.getStatus();
            logger.log(Level.INFO, "Pigeon status - CHILLING");
        } catch (LandException exception) {
            this.status = BirdStatus.OnGROUND;
            this.getStatus();
            logger.log(Level.INFO, "Pigeon status - OnGROUND");
        }
    }
}
