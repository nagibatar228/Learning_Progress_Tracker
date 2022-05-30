package tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProgressTracker tracker= new ProgressTracker();
        Student student = new Student(
                new ExitCommand(tracker),
                new RunCommand(tracker)
        );
        student.runTracker();
        student.getInputFromConsole(scanner);
    }
}
