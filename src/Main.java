import org.kata.java.exec.BirdCommandExecuter;
import org.kata.java.birds.Bird;
import org.kata.java.birds.Pigeon;
import org.kata.java.commands.FlyCommand;
import org.kata.java.handlers.ExceptionHandler;

public class Main {
    public static void main (String[] args) {
        Pigeon pigeon = new Pigeon();
        ExceptionHandler handler = new ExceptionHandler(new BirdCommandExecuter(), pigeon, new FlyCommand(pigeon));
        System.out.println(pigeon.getStatus());
        handler.handleException();
        System.out.println(pigeon.getStatus());
    }
}
