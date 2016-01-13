import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommandFactory commandFactory = CommandFactory.init();
        String line = "";
        while(!line.equals("Exit")) {
            Scanner sc = new Scanner(System.in);
            line = sc.nextLine();
            commandFactory.execute(line);
        }
    }
}
