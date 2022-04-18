package com.apstamp45.stack_language.program.action.push;

import com.apstamp45.stack_language.program.Stack;
import com.apstamp45.stack_language.program.action.NoJumpAction;

/**
 * Calculates the size of the stack, and
 * pushes that size on top.
 */
public class PushSize extends NoJumpAction {

    @Override
    public void doAction() {
        process.getStack().pushSize();
    }
}
