package com.apstamp45.stack_language.program.action;

import com.apstamp45.stack_language.Stack;

public class Delete extends NoJumpAction {

    /**
     * If this Delete is a double action, it will
     * pop the last value off the stack, and delete
     * that many values from the stack.
     */
    public final boolean doubleAction;

    /**
     * Creates a Delete with the given doubleAction value.
     * @param doubleAction Whether this is a double action.
     */
    public Delete(boolean doubleAction) {
        this.doubleAction = doubleAction;
    }

    @Override
    public void doAction() {
        if (doubleAction) {
            for (int i = Stack.pop(); i > 1; i--) {
                Stack.delete();
            }
        } else {
            Stack.delete();
        }
    }
}
