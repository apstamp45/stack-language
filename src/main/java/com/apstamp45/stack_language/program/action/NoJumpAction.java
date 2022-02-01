package com.apstamp45.stack_language.program.action;

import com.apstamp45.stack_language.program.Program;
import com.apstamp45.stack_language.program.action.Action;

/**
 * An Action that does not jump to a different
 * place in the program.
 */
public abstract class NoJumpAction extends Action {

    /**
     * Runs doAction(), then increments Program.nextAction.
     */
    public void run() {
        doAction();
        Program.setNextAction(Program.getCurrentAction() + 1);
    }

    /**
     * Runs before incrementing Program.nextAction.
     */
    public abstract void doAction();
}
