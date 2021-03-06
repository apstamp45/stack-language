package com.apstamp45.stack_language.program;

import java.util.ArrayList;

/**
 * This class stores and is capable of running all
 * the StackProcesses.
 */
public class Program {

    /**
     * Stores all the StackProcess/es.
     */
    private static final ArrayList<StackProcess> processes = new ArrayList<>();

    /**
     * Adds a StackProcess/es to the list.
     * @param processes The StackProcess to add.
     */
    public static void addStackProcesses(StackProcess... processes) {
        for (StackProcess process: processes) {
            if (process != null) {
                Program.processes.add(process);
            }
        }
    }

    /**
     * Runs the specified process.
     * @param processID The process's ID.
     * @param stack The Stack to enter into the process.
     * @return Whether the process with the given processID was found.
     */
    public static boolean runProcess (String processID, Stack stack) {
        for (StackProcess process: processes) {
            if (process.processID.equals(processID)) {
                runProcess(process, stack);
                return true;
            }
        }
        return false;
    }

    private static void runProcess(StackProcess process, Stack stack) {
        process.runProgram(stack);
    }
}
