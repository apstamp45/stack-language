package com.apstamp45.stack_language.program;

import com.apstamp45.stack_language.Stack;

/**
 * This Action adds an int value to the stack.
 */
public class Push extends NoJumpAction {

    /**
     * The int value.
     */
    private final int value;

    /**
     * Crates an IntValue with the specified
     * value.
     * @param value The int to add.
     */
    public Push(int value) {
        this.value = value;
    }

    /**
     * Adds the int value to the stack.
     */
    @Override
    public void doAction() {
        Stack.push(value);
    }
}
