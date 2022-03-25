package com.apstamp45.stack_language.program.action;

import com.apstamp45.stack_language.Stack;
import com.apstamp45.stack_language.program.StackProcess;

/**
 * Jumps to a given destination in the program if
 * the condition is met.
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
            System.err.println("Jump created with invalid condition code: " + condition + ".");
            System.exit(1);
        }
        this.destination = destination;
    }

    /**
     * Jumps to destination if condition is met.
     */
    @Override
    public void run() {
        boolean toJump = testCondition();
        if (condition < 0) toJump = !toJump;
        if (toJump) {
            StackProcess.setNextAction(StackProcess.getDestinationAddress(destination));
        } else {
            StackProcess.setNextAction(StackProcess.getCurrentAction() + 1);
        }
    }

    /**
     * Returns true if the condition is met.
     * @return Whether the condition is met.
     */
    private boolean testCondition() {
        int a = Stack.get(1);
        int b = Stack.peek();
        int condition = this.condition < 0 ? this.condition * -1 : this.condition;
        return switch (condition) {
            case 0 -> true;
            case 1 -> a == b;
            case 2 -> a > b;
            case 3 -> a >= b;
            case 4 -> a < b;
            case 5 -> a <= b;
            case 6 -> Stack.size() < 1;
            default -> false;
        };
    }
}
