/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.recursion.stacks;

/**
 *
 * @author dannylantigua
 */
public class StackY {

    private int maxSize;
    private int[] stackArray;
    private int top; // top of the stack

    public StackY(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int p) {
        stackArray[++top] = p;
    }

    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == 1);
    }
}
