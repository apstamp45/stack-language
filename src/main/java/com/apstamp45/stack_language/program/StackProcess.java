package com.apstamp45.stack_language.program;

import com.apstamp45.stack_language.program.action.Action;
import com.apstamp45.stack_language.program.action.JumpDestination;

import java.util.ArrayList;

/**
 * Stores the stack com.apstamp45.stack_language.program.
 */
public class StackProcess {

    public final String processID;

    /**
     * Stores this StackProcess's Stack.
     */
    private Stack stack;

    /**
     * Stores the StackProcess' actions.
     */
    private final ArrayList<Action> process = new ArrayList<>();

    /**
     * Stores JumpDestination/s for later use.
     */
    private final ArrayList<JumpDestination> jumpDestinations = new ArrayList<>();

    /**
     * Stores the index of the current action being
     * executed.
     */
    private int currentAction = 0;

    /**
     * Stores the index of the next action to be
     * executed.
     */
    private int nextAction;

    /**
     * Creates a StackProcess
     * @param processID The name of this process.
     */
    public StackProcess(String processID) {
        this.processID = processID;
    }

    /**
     * Gets this StackProcess's Stack.
     * @return The Stack.
     */
    public Stack getStack() {
        return stack;
    }
    /**
     * Returns the current action index.
     * @return The current action index.
     */
    public int getCurrentAction() {
        return currentAction;
    }

    /**
     * Returns the program's current size.
     * @return The program's current size.
     */
    public int getProgramSize() {
        return process.size();
    }

    /**
     * Adds a JumpDestination to the program.
     * @param jumpDestination The JumpDestination.
     */
    public void addJumpDestination(JumpDestination jumpDestination) {
        jumpDestinations.add(jumpDestination);
    }
    /**
     * Returns a jump destination for a given jump label.
     * @param destination The destination label.
     * @return The address of the given label.
     */
    public int getDestinationAddress(String destination) {
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
    public void setNextAction(int nextAction) {
        this.nextAction = nextAction;
    }

    /**
     * Adds given actions to the program.
     * @param actions The actions to add.
     */
    public void addActions(Action... actions) {
        if (actions == null) return;
        for (Action action: actions) {
            action.setProcess(this);
            action.onCreate();
            process.add(action);
        }
    }

    /**
     * Runs the Action at index currentAction.
     */
    public void runCurrentAction() {
        process.get(currentAction).run();
        currentAction = nextAction;
    }

    /**
     * Runs program.get(currentAction) until currentAction
     * is out of bounds of program.
     */
    public void runProgram(Stack stack) {
        this.stack = stack;
        while (currentAction < process.size()) {
            runCurrentAction();
        }
    }
}
