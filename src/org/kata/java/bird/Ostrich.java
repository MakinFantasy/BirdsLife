package org.kata.java.bird;

import org.kata.java.command.Command;
import org.kata.java.exception.*;
import org.kata.java.status.BirdStatus;

import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Ostrich extends Bird {

    @Override
    public void getStatus() {
        System.out.println("Ostrich status: " + this.status);
    }

    @Override
    public void fly() {
        System.out.println("Ostrich is flying");
    }

    @Override
    public void landDown() {
        System.out.println("Ostrich landed");
    }

    @Override
    public void chill() {
        System.out.println("Ostrich is on wires...");
    }

    @Override
    public void die() {
        System.out.println("Ostrich dead");
    }

    @Override
    public void handler(Command command) {
        Logger logger = Logger.getLogger(this.getClass().getName());
        try (FileInputStream fileInputStream = new FileInputStream("logcfg.txt")){
            LogManager.getLogManager().readConfiguration(fileInputStream);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        try {
            try {
                command.exec(this);
            } catch (FlyException exception) {
                this.status = BirdStatus.FLYING;
                this.getStatus();
                logger.log(Level.INFO, "Ostrich status - FLYING");
            } catch (ChillException exception) {
                throw new WeightException("Ostrich is fucking fat!!!");
            } catch (DieException exception) {
                this.status = BirdStatus.DEAD;
                this.getStatus();
                logger.log(Level.INFO, "Ostrich status - DEAD");
            } catch (LandException exception) {
                this.status = BirdStatus.OnGROUND;
                this.getStatus();
                logger.log(Level.INFO, "Ostrich status - OnGROUND");
            }
        } catch (WeightException exception) {
            System.out.println(exception.getMessage());
            this.status = BirdStatus.DEAD;
            this.getStatus();
            logger.log(Level.INFO, "Ostrich status - DEAD BECAUSE FAT");
        }
    }
}