package com.apstamp45.stack_language.program.action.math;

import com.apstamp45.stack_language.Stack;
import com.apstamp45.stack_language.program.action.NoJumpAction;

/**
 * Multiplies the top 2 stack values.
 */
public class Multiply extends NoJumpAction {

    /**
     * Will determine whether this Action will
     * append the product, or merge the top 2 values.
     */
    private final boolean append;

    /**
     * Creates a Multiply Action.
     * @param append Whether this Action will
     * append the product, or merge the top 2 values.
     */
    public Multiply(boolean append) {
        this.append = append;
    }

    /**
     * Runs Stack.multiply(), or, if append == true,
     * runs Stack.multiplyAndAppend();
     */
    @Override
    public void doAction() {
        if (append) {
            Stack.multiplyAndAppend();
        } else {
            Stack.multiply();
        }
    }
}
