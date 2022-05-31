package tracker.Command;
import com.google.common.collect.ImmutableMap;
import tracker.ProgressTracker;

import static tracker.Command.Commands.*;

public class CommandContainer {
    private final ImmutableMap<String, Command> commandMap;

    public CommandContainer(ProgressTracker tracker) {
        commandMap = ImmutableMap.<String, Command>builder()
                .put(EXIT.getCommandName(), new ExitCommand(tracker))
                .put(BACK.getCommandName(), new BackCommand(tracker))
                .put(ADD_STUDENTS.getCommandName(), new AddUserCommand(tracker))
                .build();
                    }
}
