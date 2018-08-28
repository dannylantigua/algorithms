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
public class StackX {

    private int maxSize;
    private Params[] stackArray;
    private int top; // top of the stack

    public StackX(int s) {
        maxSize = s;
        stackArray = new Params[maxSize];
        top = -1;
    }

    public void push(Params p) {
        stackArray[++top] = p;
    }

    public Params pop() {
        return stackArray[top--];
    }

    public Params peek() {
        return stackArray[top];
    }
}
