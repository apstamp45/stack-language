package com.apstamp45.stack_language;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Handles the memory stack for the program.
 */
public class Stack {

    /**
     * Stores the memory stack.
     */
    private final LinkedList<Integer> stack = new LinkedList<>();

    /**
     * Pops the first element of the list, and returns the
     * value, or 0 if no element exists.
     * @return The pop value, or 0.
     */
    public int pop() {
        try {
            return stack.pop();
        } catch (NoSuchElementException e) {
            return 0;
        }
    }

    /**
     * Returns the value of the top stack value, or,
     * if no elements exist, 0.
     * @return The peek value, or 0.
     */
    public int peek() {
        return stack.peek() == null ? 0 : stack.peek();
    }

    /**
     * Returns the value stored at the specified index,
     * or 0 if none exists.
     * @param index The index.
     * @return The index value, or 0.
     */
    public int get(int index) {
        try {
            return stack.get(index);
        } catch (IndexOutOfBoundsException e) {
            return 0;
        }
    }

    /**
     * Returns the stack's size.
     * @return The stack's size.
     */
    public int size() {
        return stack.size();
    }

    /**
     * Adds the stack's size to the stack.
     */
    public void pushSize() {
        stack.push(size());
    }

    /**
     * Prints the char value of the first stack item.
     */
    public void printChar() {
        int value = peek();
        if (value < 0 || value > 127) {
            value = 0;
        }
        System.out.print((char) value);
    }

    /**
     * Adds a value to the top of the stack.
     * @param value The value to add.
     */
    public void push(int value) {
        stack.push(value);
    }

    /**
     * Removes the first element of the stack.
     */
    public void delete() {
        try {
            stack.remove();
        } catch (NoSuchElementException ignored) {}
    }

    /**
     * Clones the first element of the stack.
     */
    public void duplicate() {
        stack.push(peek());
    }

    /**
     * Adds the first two values of the stack and
     * appends the sum to the stack.
     */
    public void addAndAppend() {
        stack.push(peek() + get(1));
    }

    /**
     * Pops last 2 stack items and appends the sum of them.
     */
    public void add() {
        stack.push(pop() + pop());
    }

    /**
     * Adds the value of the second stack item minus the
     * first to the stack.
     */
    public void subtractAndAppend() {
        stack.push(get(1) - peek());
    }

    /**
     * Pops the last two values and adds the difference of
     * the second value minus the first to the stack.
     */
    public void subtract() {
        int value = pop();
        stack.push(pop() - value);
    }

    /**
     * Pushes the product of the first 2 stack values to
     * the stack.
     */
    public void multiplyAndAppend() {
        stack.push(get(1) * peek());
    }

    /**
     * Pops the first 2 stack values, and adds their
     * product to the stack.
     */
    public void multiply() {
        stack.push(pop() * pop());
    }

    /**
     * Adds the quotient of the second value divided by
     * the first value to the stack.
     */
    public void divideAndAppend() {
        stack.push(get(1) / peek());
    }

    /**
     * Pops the top 2 values and adds the quotient of
     * the second divided by the first to the stack.
     */
    public void divide() {
        int value = pop();
        stack.push(pop() / value);
    }

    /**
     * Shifts the stack left by one (moves the last element
     * to the top of the stack).
     */
    public void shiftLeft() {
        if (size() < 1) return;
        stack.push(stack.pollLast());
    }

    /**
     * Shifts the stack left x times, where x is the fist element
     * of the stack (which is also removed).
     */
    public void shiftLeftX() {
        int times = pop();
        for (int i = 0; i < times;i++) {
            shiftLeft();
        }
    }

    /**
     * Shifts the stack right by one (moves the first element
     * to the bottom of the stack).
     */
    public void shiftRight() {
        if (size() < 1) return;
        stack.add(stack.pop());
    }

    /**
     * Shifts the stack right x times, where x is the first element
     * of the stack (which is also removed).
     */
    public void shiftRightX() {
        int times = pop();
        for (int i = 0; i < times; i++) {
            shiftRight();
        }
    }

    /**
     * Pops the first value, and inserts it at x,
     * where x is the first value of the stack (which will
     * be deleted).
     */
    public void insert() {
        int index = pop();
        int size = stack.size();
        if (index >= size) index = size - 1;
        stack.add(index, pop());
    }
}
