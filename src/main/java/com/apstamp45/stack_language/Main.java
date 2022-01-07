package com.apstamp45.stack_language;

import com.apstamp45.stack_language.program.Program;
import com.apstamp45.stack_language.program.action.PrintChar;
import com.apstamp45.stack_language.program.action.Push;
import com.apstamp45.stack_language.program.action.math.Add;
import com.apstamp45.stack_language.program.action.math.Divide;
import com.apstamp45.stack_language.program.action.math.Multiply;
import com.apstamp45.stack_language.program.action.math.Subtract;

public class Main {
    public static void main(String[] args) {
        // 9,8*6/5-48+p
        Program.addActions(new Push(9), new Push(8), new Multiply(false), new Push(6),
                new Divide(false), new Push(5), new Subtract(false), new Push(48),
                new Add(false), new PrintChar());
        Program.runProgram();
    }
}
