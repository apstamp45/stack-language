package com.apstamp45.stack_language.program;

/**
 * Defines a program action. Actions can include things
 * like adding values to the stack, doing operations
 * on the stack, and jumping to a location in the program.
 */
public interface Action {

    /**
     * Is run by Program when it is the current action.
     * Is responsible for setting Program.nextAction to
     * the correct value.
     */
    void run();
}
