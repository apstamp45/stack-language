package com.apstamp45.stack_language.program.action.push;

import com.apstamp45.stack_language.program.Stack;
import com.apstamp45.stack_language.program.action.NoJumpAction;

public class PushCharArray extends NoJumpAction {

    /**
     * Stores the character values.
     */
    private final char[] values;

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
            process.getStack().push(value);
        }
    }
}
