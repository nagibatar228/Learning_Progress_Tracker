package tracker.Command;

import tracker.ProgressTracker;

public class ExitCommand implements Command {
    ProgressTracker tracker;

    public ExitCommand(ProgressTracker tracker) {
        this.tracker = tracker;
    }

    @Override
    public void execute() {
        tracker.stop();
    }
}
