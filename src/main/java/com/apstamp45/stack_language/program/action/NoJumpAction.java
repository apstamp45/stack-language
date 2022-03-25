package com.apstamp45.stack_language.program.action;

/**
 * An Action that does not jump to a different
 * place in the program.
 */
public abstract class NoJumpAction extends Action {

    /**
     * Runs doAction(), then increments StackProcess.nextAction.
     */
    public void run() {
        doAction();
        process.setNextAction(process.getCurrentAction() + 1);
    }

    /**
     * Runs before incrementing StackProcess.nextAction.
     */
    public abstract void doAction();
}
