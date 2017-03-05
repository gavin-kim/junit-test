package mockObject;


import util.ValidationException;
import util.Validator;

public class CommandProcessor {
    public void process(Command command) {
        // do something...

        Validator.notNull(command, "Command"); // stubbing

        validate(command); // stubbing
        command.execute(); // stubbing

        // do something...
    }

    private void validate(Command command) {
        if (!command.isValid()) {
            throw new ValidationException("Invalid value");
        }
    }
}
