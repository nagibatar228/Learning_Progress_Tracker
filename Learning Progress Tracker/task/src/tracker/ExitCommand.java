package tracker;

public class ExitCommand implements Command{
    ProgressTracker tracker;

    public ExitCommand(ProgressTracker tracker) {
        this.tracker = tracker;
    }

    @Override
    public void execute() {
        tracker.exit();
    }
}
