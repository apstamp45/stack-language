package com.apstamp45.stack_language.program;

import com.apstamp45.stack_language.program.action.Action;
import com.apstamp45.stack_language.program.action.JumpDestination;

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
     * Stores JumpDestination/s for late use.
     */
    private static final ArrayList<JumpDestination> jumpDestinations = new ArrayList<>();

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
     * Returns the program's current size.
     * @return The program's current size.
     */
    public static int getProgramSize() {
        return program.size();
    }

    /**
     * Adds a JumpDestination to the program.
     * @param jumpDestination The JumpDestination.
     */
    public static void addJumpDestination(JumpDestination jumpDestination) {
        jumpDestinations.add(jumpDestination);
    }
    /**
     * Returns a jump destination for a given jump label.
     * @param destination The destination label.
     * @return The address of the given label.
     */
    public static int getDestinationAddress(String destination) {
        for (JumpDestination jumpDestination: jumpDestinations) {
            if (destination.equals(jumpDestination.label())) {
                return jumpDestination.destination();
            }
        }
        System.err.println("Destination of label \"" + destination + "\" does not exist.");
        System.exit(1);
        return -1;
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
        for (Action action: actions) {
            action.onCreate();
            program.add(action);
        }
    }

    /**
     * Runs the Action at index currentAction.
     */
    public static void runCurrentAction() {
        program.get(currentAction).run();
        currentAction = nextAction;
    }

    /**
     * Runs program.get(currentAction) until currentAction
     * is out of bounds of program.
     */
    public static void runProgram() {
        while (currentAction < program.size()) {
            runCurrentAction();
        }
    }
}
