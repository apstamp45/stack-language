package com.apstamp45.stack_language.program.action;

import com.apstamp45.stack_language.Stack;

/**
 * Calculates the size of the stack, and
 * pushes that size on top.
 */
public class PushSize extends NoJumpAction {

    @Override
    public void doAction() {
        Stack.pushSize();
    }
}
