package com.apstamp45.stack_language.program;

/**
 * An Action that does not jump to a different
 * place in the program.
 */
public abstract class NoJumpAction implements Action {

    /**
     * Runs doAction(), then increments Program.nextAction.
     */
    public void run() {
        doAction();
        Program.setNextAction(Program.getCurrentAction() + 1);
    }

    public abstract void doAction();
}
