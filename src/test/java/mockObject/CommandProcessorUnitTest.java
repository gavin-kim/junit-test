package mockObject;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import org.junit.Test;
import util.ValidationException;

/**
 * Scenario: To Processor.process method. Command instances need to be mocked
 *           because Command class has not implemented yet
 *           There are 3 cases. Command is null, valid or invalid.
 */
public class CommandProcessorUnitTest {

    private CommandProcessor processor = new CommandProcessor();

    @Test(expected = IllegalArgumentException.class)
    public void testProcess_CommandIsNull() {
        this.processor.process(null);
    }

    @Test(expected = ValidationException.class)
    public void testProcess_CommandIsInvalid() {
        Command command = mock(Command.class);     // create a mock object
        when(command.isValid()).thenReturn(false); // when command.isValid() is invoked return false

        this.processor.process(command);
    }

    @Test
    public void testProcess() {
        Command command = mock(Command.class);
        when(command.isValid()).thenReturn(true);

        this.processor.process(command); // Nothing to check after call as there's no internal state is changed
    }
}
