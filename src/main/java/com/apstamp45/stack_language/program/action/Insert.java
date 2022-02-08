package com.apstamp45.stack_language.program.action;

import com.apstamp45.stack_language.Stack;

/**
 * Pops the top value, then moves the next value
 * that many times over to the left (down the stack).
 */
public class Insert extends NoJumpAction {

    @Override
    public void doAction() {
        Stack.insert();
    }
}
