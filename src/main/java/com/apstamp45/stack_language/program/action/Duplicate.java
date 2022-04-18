package com.apstamp45.stack_language.program.action;

import com.apstamp45.stack_language.program.Stack;

/**
 * Duplicates the top value of the stack.
 */
public class Duplicate extends NoJumpAction {

    @Override
    public void doAction() {
        process.getStack().duplicate();
    }
}
