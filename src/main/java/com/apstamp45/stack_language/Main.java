package com.apstamp45.stack_language;

public class Main {
    public static void main(String[] args) {
        // 5,6,7,2<<48p
        Stack.push(5);
        Stack.push(6);
        Stack.push(7);
        Stack.push(2);
        Stack.shiftLeftX();
        Stack.push(48);
        Stack.add();
        Stack.printChar();
    }
}
