package com.apstamp45.stack_language;

import com.apstamp45.stack_language.program.Program;
import com.apstamp45.stack_language.program.action.*;

public class Main {
    public static void main(String[] args) {
        // 0,0j=a78;p#jb_a69;p_b
        Program.addActions(
                new Jump(6, "b"),
                new Push(70),
                new PrintChar(),
                new JumpDestination("a"));
        Program.runProgram();
    }
}
