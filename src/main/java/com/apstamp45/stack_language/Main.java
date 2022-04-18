package com.apstamp45.stack_language;

import com.apstamp45.stack_language.program.Program;
import com.apstamp45.stack_language.program.Stack;
import com.apstamp45.stack_language.program.StackProcess;
import com.apstamp45.stack_language.program.action.*;
import com.apstamp45.stack_language.program.action.math.Add;
import com.apstamp45.stack_language.program.action.push.Push;
// TODO allow changing processes
public class Main {
    public static void main(String[] args) {
        // 0_a48+p#1++10j!<b#ja_b
        StackProcess process = new StackProcess("a");
        process.addActions(// 0,48, 48
                new Push(65),
                new Add(false),
                new PrintChar());
        Program.addStackProcess(process);
        Program.runProcess("a", new Stack(2));
    }
}
