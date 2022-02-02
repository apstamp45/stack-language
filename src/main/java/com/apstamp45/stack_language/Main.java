package com.apstamp45.stack_language;

import com.apstamp45.stack_language.program.Program;
import com.apstamp45.stack_language.program.action.*;
import com.apstamp45.stack_language.program.action.math.Add;
import com.apstamp45.stack_language.program.action.math.Divide;
import com.apstamp45.stack_language.program.action.math.Subtract;

public class Main {
    public static void main(String[] args) {
        // 0,0j=a78;p#jb_a69;p_b
        Program.addActions(
                new Push(2),
                new Push(2),
                new Jump(-1, "a"),
                new Push(78),
                new PrintChar(),
                new Delete(false),
                new Jump(0, "b"),
                new JumpDestination("a"),
                new Push(69),
                new PrintChar(),
                new JumpDestination("b")
        );
        Program.runProgram();
    }
}
