package Library.util;

public class IdGenerator {
    private static int current = 1;

    private IdGenerator() {}

    public static int nextId() {
        return current++;
    }
}
