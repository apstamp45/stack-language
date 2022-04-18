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
        // :a0_a=1+10~!<b#~a_b#:10b
        // :b_a~*b;p#~a_b
        StackProcess a = new StackProcess("a");
        a.addActions(
                new Push(0),
                new JumpDestination("a"),
                new Duplicate(),
                new Push(1),
                new Add(false),
                new Push(10),
                new Jump(-4, "b"),
                new Delete(false),
                new Jump(0, "a"),
                new JumpDestination("b"),
                new Push(2),
                new Delete(true)
        );
        StackProcess b = new StackProcess("b");
        b.addActions(
                new JumpDestination("a"),
                new Jump(6, "b"),
                new Push(48),
                new Add(false),
                new PrintChar(),
                new Delete(false),
                new Jump(0, "a"),
                new JumpDestination("b")
        );
        Program.addStackProcesses(a, b);
        Stack stack = new Stack();
        Program.runProcess("a", stack);
        Program.runProcess("b", stack.subStack(5));
    }
}
