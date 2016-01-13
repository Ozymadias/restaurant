import java.util.HashMap;
import java.util.stream.Stream;

public class CommandFactory {
    HashMap<String, Command> commands = new HashMap<>();

    void add(String name, Command command) {
        commands.put(name, command);
    }

    public static CommandFactory init() {
        CommandFactory commandFactory = new CommandFactory();
        commandFactory.add("Dodaj", () -> System.out.println("Dodałem klienta"));
        return commandFactory;
    }

    void execute(String name) {
        if(commands.containsKey(name)) {
            commands.get(name).execute();
        }
    }
}