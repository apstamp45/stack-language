package com.apstamp45.stack_language.program.action;

import com.apstamp45.stack_language.Stack;

/**
 * Shifts the stack by one if doubleAction == false,
 * or x number of times if doubleAction == true, where x
 * is equal to the top number of the stack, which will be
 * deleted BEFORE the stack gets shifted.
 * See Stack.shift____() for info on "left" and "right"
 * shifting.
 */
public class Shift extends NoJumpAction {

    /**
     * Specifies the direction to shift.
     */
    private final boolean direction;

    /**
     * Whether this is a double action.
     */
    private final boolean doubleAction;

    /**
     * Creates a Shift action.
     * @param direction The direction to shift (true == right, false == left).
     * @param doubleAction Whether this is a double action.
     */
    public Shift(boolean direction, boolean doubleAction) {
        this.direction = direction;
        this.doubleAction = doubleAction;
    }

    @Override
    public void doAction() {
        if (direction) {
            if (doubleAction) {
                Stack.shiftRightX();
            } else {
                Stack.shiftRight();
            }
        } else {
            if (doubleAction) {
                Stack.shiftLeftX();
            } else {
                Stack.shiftLeft();
            }
        }
    }
}
