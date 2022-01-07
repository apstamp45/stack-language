package com.apstamp45.stack_language.program.action;

import com.apstamp45.stack_language.Stack;
import com.apstamp45.stack_language.program.action.NoJumpAction;

/**
 * Prints a character.
 */
public class PrintChar extends NoJumpAction {

    /**
     * Prints the ascii character for the top
     * stack value.
     */
    @Override
    public void doAction() {
        Stack.printChar();
    }
}
