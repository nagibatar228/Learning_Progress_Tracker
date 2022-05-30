package tracker;

import java.util.Scanner;

public class Student {
    Command exitCommand;
    Command runCommand;

    public Student(Command exitCommand, Command runCommand) {
        this.exitCommand = exitCommand;
        this.runCommand = runCommand;
    }

    public void closeTracker() {
        exitCommand.execute();
    }

    public void runTracker() {
        runCommand.execute();
    }

    public void getInputFromConsole(Scanner scanner) {
        while (true) {
            this.processInput(scanner.nextLine());

        }
    }

    void processInput(String userInput) {
        if (isBlankString(userInput)) {
            System.out.println("No input");
        } else if (userInput.equals("exit")) {
            closeTracker();
        } else {
            System.out.println("Error: unknown command!");
        }
    }
    boolean isBlankString (String userInput) {
        return userInput == null || userInput.isBlank();
    }
}
