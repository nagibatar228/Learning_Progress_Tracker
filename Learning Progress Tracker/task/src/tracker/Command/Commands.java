package tracker.Command;

public enum Commands {
    EXIT("exit"),
    BACK("back"),
    ADD_STUDENTS("add students");

    String commandName;
    Commands (String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return this.commandName;
    }
}
