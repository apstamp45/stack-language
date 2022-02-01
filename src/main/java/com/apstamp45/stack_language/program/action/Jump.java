package com.apstamp45.stack_language.program.action;

import com.apstamp45.stack_language.Stack;
import com.apstamp45.stack_language.program.Program;

/**
 * Jumps to a given destination in the program if
 * conditions are met.
 */
public class Jump extends Action {

    /**
     * Stores the Jump's condition.
     */
    private final int condition;

    /**
     * Stores the jump destination.
     */
    private final String destination;

    /**
     * Creates a Jump Action with the given condition.
     * Conditions are tested like a (test) b, where b is
     * the top value of the stack, and a is the second from top.
     * Making the condition code negative makes the condition
     * inverted; example: 1: a == 0, -1: a != 0.
     * Condition codes:
     * 0: no condition; automatic jump
     * 1: a == b
     * 2: a > b
     * 3: a >= b
     * 4: a < b
     * 5: a <= b
     * 6: jump if stack is empty
     * @param condition The condition code.
     */
    public Jump(int condition, String destination) {
        this.condition = condition;
        if (condition > 6 || condition < -6) {
            System.out.println("Error: Jump with condition code " + condition + ", which is invalid.");
            System.exit(1);
        }
        this.destination = destination;
    }
    @Override
    public void run() {
        if (testCondition()) {
            Program.setNextAction(Program.getDestinationAddress(destination));
        }
    }

    /**
     * Returns true if the condition is met.
     * @return Whether the condition is met.
     */
    private boolean testCondition() {
        int a = Stack.get(1);
        int b = Stack.peek();
        return switch (condition) {
            case 0 -> true;
            case 1 -> a == b;
            case 2 -> a > b;
            case 3 -> a >= b;
            case 4 -> a < b;
            case 5 -> a <= b;
            case 6 -> Stack.size() == 0;
            default -> false;
        };
    }
}
