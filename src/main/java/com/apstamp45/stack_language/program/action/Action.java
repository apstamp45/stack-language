package com.apstamp45.stack_language.program.action;

import com.apstamp45.stack_language.program.StackProcess;

/**
 * Defines a program action. Actions can include things
 * like adding values to the stack, doing operations
 * on the stack, and jumping to a location in the program.
 */
public abstract class Action {

    /**
     * This variable is set when added to a StackProcess.
     */
    protected StackProcess process = null;

    /**
     * Sets the Action's StackProcess.
     * @param process The StackProcess that this Aciton is in.
     */
    public void setProcess(StackProcess process) {
        if (this.process == null) {
            this.process = process;
        }
    }

    /**
     * Is run by StackProcess when it is the current action.
     * Is responsible for setting StackProcess.nextAction to
     * the correct value.
     */
    public abstract void run();

    /**
     * Is run right before the Action is being added to the process.
     */
    public void onCreate() {}
}
