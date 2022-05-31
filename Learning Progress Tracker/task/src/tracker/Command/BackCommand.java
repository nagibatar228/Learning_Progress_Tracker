package tracker.Command;

import tracker.ProgressTracker;

public class BackCommand implements Command {
    ProgressTracker tracker;
    public BackCommand(ProgressTracker tracker) {
        this.tracker = tracker;
    }

    @Override
    public void execute() {

    }
}
