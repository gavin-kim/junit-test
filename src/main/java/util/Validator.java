package util;

public class Validator {
    public static <T> T notNull(T object, String message) {
        if (object == null)
            throw new IllegalArgumentException(message);

        return object;
    }
}
