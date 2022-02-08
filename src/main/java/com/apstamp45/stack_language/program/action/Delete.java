package com.apstamp45.stack_language.program.action;

import com.apstamp45.stack_language.Stack;

/**
 * Deletes the top value, or, if doubleAction == true,
 * POPs the top value and deletes that many MORE values.
 */
public class Delete extends NoJumpAction {

    /**
     * Whether this is a double action.
     */
    public final boolean doubleAction;

    /**
     * Creates a Delete.
     * @param doubleAction Whether this is a double action.
     */
    public Delete(boolean doubleAction) {
        this.doubleAction = doubleAction;
    }

    @Override
    public void doAction() {
        if (doubleAction) {
            int times = Stack.pop();
            for (int i = 0; i < times; i++) {
                Stack.delete();
            }
        } else {
            Stack.delete();
        }
    }
}
