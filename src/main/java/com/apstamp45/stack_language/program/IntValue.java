package com.apstamp45.stack_language.program;

import com.apstamp45.stack_language.Stack;

/**
 * This Action adds an int value to the stack.
 */
public class IntValue implements Action {

    /**
     * The int value.
     */
    private int value;

    /**
     * Crates an IntValue with the specified
     * value.
     * @param value The int to add.
     */
    public IntValue(int value) {
        this.value = value;
    }

    /**
     * Adds the int value to the stack.
     */
    @Override
    public void run() {
        Stack.push(value);
        Program.setNextAction(Program.getCurrentAction() + 1);
    }
}
