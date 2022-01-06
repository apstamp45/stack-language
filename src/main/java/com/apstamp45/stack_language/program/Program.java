package com.apstamp45.stack_language.program;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Stores the stack com.apstamp45.stack_language.program.
 */
public class Program {

    /**
     * Stores the com.apstamp45.stack_language.program's actions.
     */
    private static final ArrayList<Action> program = new ArrayList<>();

    /**
     * Stores the index of the current action being
     * executed.
     */
    private static int currentAction = 0;

    /**
     * Stores the index of the next action to be
     * executed.
     */
    private static int nextAction;

    /**
     * Returns the current action index.
     * @return The current action index.
     */
    public static int getCurrentAction() {
        return currentAction;
    }

    /**
     * Sets the index of the next action to be executed.
     * @param nextAction The next action's index.
     */
    public static void setNextAction(int nextAction) {
        Program.nextAction = nextAction;
    }

    /**
     * Adds given actions to the program.
     * @param actions The actions to add.
     */
    public static void addActions(Action... actions) {
        if (actions == null) return;
        program.addAll(Arrays.asList(actions));
    }
}
