package spyObject;

public class Person {

    private String firstName;
    private String lastName;

    // NOTE: there's no constructor accepting input parameters or setters for the member variables!

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    protected String getFirstName() {
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }
}
