package com.apstamp45.stack_language.program.action.math;

import com.apstamp45.stack_language.program.action.NoJumpAction;

/**
 * Adds the top 2 stack values.
 */
public class Add extends NoJumpAction {

    /**
     * Will determine whether this Action will
     * append the sum, or merge the top 2 values.
     */
    private final boolean append;

    /**
     * Creates an Add Action.
     * @param append Whether this Action will
     * append the sum, or merge the top 2 values.
     */
    public Add(boolean append) {
        this.append = append;
    }

    /**
     * Runs Stack.add(), or, if append == true,
     * runs Stack.addAndAppend();
     */
    @Override
    public void doAction() {
        if (append) {
            process.getStack().addAndAppend();
        } else {
            process.getStack().add();
        }
    }
}
