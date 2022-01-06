package com.apstamp45.stack_language.program;

import com.apstamp45.stack_language.Stack;

public class PushCharArray extends NoJumpAction {

    /**
     * Stores the character values.
     */
    private char[] values;

    /**
     * Crates a StringValue with the specified characters.
     * @param values The character values.
     */
    public PushCharArray(char[] values) {
        this.values = values;
    }

    /**
     * Adds the characters' int values to the stack.
     */
    @Override
    public void doAction() {
        for (char value : values) {
            Stack.push(value);
        }
        Program.setNextAction(Program.getCurrentAction() + 1);
    }
}
