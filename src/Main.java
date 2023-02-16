import org.kata.java.birds.Ostrich;
import org.kata.java.commands.ChillCommand;
import org.kata.java.commands.DieCommand;
import org.kata.java.commands.LandDownCommand;
import org.kata.java.exec.BirdCommandExecuter;
import org.kata.java.birds.Bird;
import org.kata.java.birds.Pigeon;
import org.kata.java.commands.FlyCommand;
import org.kata.java.handlers.ExceptionHandler;

public class Main {
    public static void main (String[] args) {
        Pigeon pigeon = new Pigeon();
        Ostrich ostrich = new Ostrich();
        ExceptionHandler handler = new ExceptionHandler(new BirdCommandExecuter(), pigeon, new DieCommand(pigeon));
        handler.handleException();
        handler = new ExceptionHandler(new BirdCommandExecuter(), ostrich, new LandDownCommand(ostrich));
        handler.handleException();
    }
}
