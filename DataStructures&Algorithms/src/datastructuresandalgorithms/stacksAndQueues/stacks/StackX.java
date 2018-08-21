/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.stacksAndQueues.stacks;

/**
 *
 * @author dannylantigua
 */
public class StackX {

    private int maxSize;
    private long[] stackArray;
    private int top; // top of the stack

    public StackX(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    // put item on top of the stack
    public void push(long j) {
        // increment top, insert item
        stackArray[++top] = j;
    }

    // take item from top of the stack
    public long pop() {
        // access item, decrement top
        return stackArray[top--];
    }

    // return the value of the top
    public long peek() {
        return stackArray[top];
    }

    // true if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // true if stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
