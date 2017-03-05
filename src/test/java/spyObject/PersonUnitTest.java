package spyObject;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Scenario: Person object doesn't have setter methods.
 *           Some of methods need to be stubbed for the unit test.
 *
 *           Mock: not actual object (bare-bone shell instance of the Class)
 *                 You can use real methods using doCallRealMethod()
 *           Spy: wrapped existing object. methods are real and can modify
 *                properties. For partial mocks You have to stub methods
 *                @Spy or Mokito.spy() is a recommended way of creating partial mocks.
 */
@RunWith(MockitoJUnitRunner.class) // use Mockito framework for JUnit test
public class PersonUnitTest {

    @Spy
    private Person person = new Person();

    @Test
    public void testGetFullName() {
        String firstName = "Yoonkwan";
        String lastName = "Kim";

        doReturn(firstName).when(this.person).getFirstName();
        doReturn(lastName).when(this.person).getLastName();

        assertThat(this.person.getFullName(), is(firstName + " " + lastName));
    }
}
