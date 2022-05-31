package tracker.Command;

import tracker.ProgressTracker;

public class AddUserCommand implements Command {
    ProgressTracker tracker;
    public AddUserCommand(ProgressTracker tracker) {
        this.tracker = tracker;
    }

    @Override
    public void execute() {
        tracker.addStudent();
    }
}
