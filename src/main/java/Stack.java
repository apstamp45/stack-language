import java.util.LinkedList;

/**
 * Handles the memory stack for the program.
 */
public class Stack {

    /**
     * Stores the memory stack.
     */
    private static LinkedList<Integer> stack = new LinkedList<>();

    /**
     * Adds a value to the top of the stack.
     * @param value The value to add.
     */
    public static void push(int value) {
        stack.addFirst(value);
    }

    /**
     * Removes the first element of the stack.
     */
    public static void delete() {
        stack.removeFirst();
    }

    /**
     * Clones the first element of the stack.
     */
    public static void copy() {
        stack.addFirst(stack.peek());
    }

    /**
     * Adds the first two values of the stack and
     * appends the sum to the stack.
     */
    public void addAndAppend() {

    }
}
