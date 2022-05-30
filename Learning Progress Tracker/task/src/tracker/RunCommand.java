package tracker;

public class RunCommand implements Command{
    ProgressTracker tracker;

    public RunCommand(ProgressTracker tracker) {
        this.tracker = tracker;
    }

    @Override
    public void execute() {
        tracker.run();
    }
}
