package com.apstamp45.stack_language.program.action;

import com.apstamp45.stack_language.program.Program;

/**
 * This Action just reserves an index to which to jump.
 */
public class JumpDestination extends NoJumpAction {

    /**
     * The JumpDestination's label.
     */
    private final String label;

    /**
     * The JumpDestination's program index.
     */
    private int destination;

    public JumpDestination(String label) {
        this.label = label;
    }

    /**
     * Returns the label of this jump destination.
     * @return This JumpDestination's label.
     */
    public String label() {
        return label;
    }

    @Override
    public void onCreate() {
        System.out.println("JumpDestination.onCreate()");
        destination = Program.getProgramSize();
        Program.addJumpDestination(this);
    }

    /**
     * Returns the address of this Action.
     * @return The address of this Action.
     */
    public int destination() {
        return destination;
    }

    /**
     * This NoJumpAction doesn't actually do anything when run.
     */
    @Override
    public void doAction() {}
}
