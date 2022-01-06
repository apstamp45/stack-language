package com.apstamp45.stack_language;

import com.apstamp45.stack_language.program.Add;
import com.apstamp45.stack_language.program.PrintChar;
import com.apstamp45.stack_language.program.Program;
import com.apstamp45.stack_language.program.Push;

public class Main {
    public static void main(String[] args) {
        // 50pn40p
        Program.addActions(new Push(50), new PrintChar(), new Push(-40), new Add(), new PrintChar());
        Program.runProgram();
    }
}
