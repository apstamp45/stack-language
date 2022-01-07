package com.apstamp45.stack_language.program.action.math;

import com.apstamp45.stack_language.Stack;
import com.apstamp45.stack_language.program.action.NoJumpAction;

/**
 * Subtracts the top 2 stack values.
 */
public class Subtract extends NoJumpAction {

    /**
     * Will determine whether this Action will
     * append the difference, or merge the top 2 values.
     */
    private final boolean append;

    /**
     * Creates a Subtract Action.
     * @param append Whether this Action will
     * append the difference, or merge the top 2 values.
     */
    public Subtract(boolean append) {
        this.append = append;
    }

    /**
     * Runs Stack.subtract(), or, if append == true,
     * runs Stack.subtractAndAppend();
     */
    @Override
    public void doAction() {
        if (append) {
            Stack.subtractAndAppend();
        } else {
            Stack.subtract();
        }
    }
}
