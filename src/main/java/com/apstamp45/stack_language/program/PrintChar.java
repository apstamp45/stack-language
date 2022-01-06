package com.apstamp45.stack_language.program;

import com.apstamp45.stack_language.Stack;

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
