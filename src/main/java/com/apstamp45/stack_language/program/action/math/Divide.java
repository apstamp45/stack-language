package com.apstamp45.stack_language.program.action.math;

import com.apstamp45.stack_language.program.action.NoJumpAction;

/**
 * Divides the top 2 stack values.
 */
public class Divide extends NoJumpAction {

    /**
     * Will determine whether this Action will
     * append the quotient, or merge the top 2 values.
     */
    private final boolean append;

    /**
     * Creates a Divide Action.
     * @param append Whether this Action will
     * append the quotient, or merge the top 2 values.
     */
    public Divide(boolean append) {
        this.append = append;
    }

    /**
     * Runs Stack.divide(), or, if append == true,
     * runs Stack.divideAndAppend();
     */
    @Override
    public void doAction() {
        if (append) {
            process.getStack().divideAndAppend();
        } else {
            process.getStack().divide();
        }
    }
}
