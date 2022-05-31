package tracker;

import tracker.Command.ExitCommand;
import tracker.Command.RunCommand;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProgressTracker tracker= new ProgressTracker();
        UserInputProcessor userInputProcessor = new UserInputProcessor(
                new ExitCommand(tracker),
                new RunCommand(tracker)
        );
        userInputProcessor.runTracker();
        userInputProcessor.getInputFromConsole(scanner);
    }
}
