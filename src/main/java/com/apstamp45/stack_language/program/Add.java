package com.apstamp45.stack_language.program;

import com.apstamp45.stack_language.Stack;

/**
 * Runs Stack.add().
 */
public class Add extends NoJumpAction {
    @Override
    public void doAction() {
        Stack.add();
    }
}
