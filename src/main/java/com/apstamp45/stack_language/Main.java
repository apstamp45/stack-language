package com.apstamp45.stack_language;

import com.apstamp45.stack_language.program.Program;
import com.apstamp45.stack_language.program.StackProcess;
import com.apstamp45.stack_language.program.action.*;
import com.apstamp45.stack_language.program.action.math.Add;
import com.apstamp45.stack_language.program.action.push.Push;

public class Main {
    public static void main(String[] args) {
        // 0_a48+p#1++10j!<b#ja_b
        StackProcess process = new StackProcess("a");
        process.addActions(// 0,48, 48
                new Push(0),
                new JumpDestination("a"),
                new Duplicate(),
                new Push(48),
                new Add(false),
                new PrintChar(),
                new Delete(false),
                new Push(1),
                new Add(false),
                new Push(100),
                new Jump(3, "b"),
                new Delete(false),
                new Jump(0, "a"),
                new JumpDestination("b"));
        Program.addStackProcess(process);
    }
}
