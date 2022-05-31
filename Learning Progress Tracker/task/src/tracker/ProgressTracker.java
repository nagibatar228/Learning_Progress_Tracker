package tracker;

public class ProgressTracker {
    long numberOfRegisteredUsers;
    public ProgressTracker () {
        numberOfRegisteredUsers = 0;
        start();
    }

    public void stop() {
        System.out.println("Bye!");
        System.exit(0);
    }

    public void start() {
        System.out.println("Learning Progress Tracker");
    }

    public void addStudent(String firstName, String lastName, String email) {

    }
}
