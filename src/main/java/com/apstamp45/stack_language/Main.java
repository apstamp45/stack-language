package com.apstamp45.stack_language;

import com.apstamp45.stack_language.program.Program;
import com.apstamp45.stack_language.program.action.*;
import com.apstamp45.stack_language.program.action.math.Add;
import com.apstamp45.stack_language.program.action.math.Divide;
import com.apstamp45.stack_language.program.action.math.Subtract;

public class Main {
    public static void main(String[] args) {
        // 1,0_a#1++48+;p#10j>a
        Program.addActions(
                new Push(1),
                new Push(0),
                new JumpDestination("a"),
                new Delete(false),
                new Push(1),
                new Add(false),
                new Push(48),
                new Add(true),
                new PrintChar(),
                new Delete(false),
                new Push(10),
                new Jump(2, "a"));
        Program.runProgram();
    }
}
