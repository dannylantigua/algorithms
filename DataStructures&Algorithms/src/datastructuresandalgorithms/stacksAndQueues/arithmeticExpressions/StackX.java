/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.stacksAndQueues.arithmeticExpressions;

/**
 *
 * @author dannylantigua
 */
public class StackX {

    private int maxSize;
    private char[] stackArray;
    private int top; // top of the stack

    public StackX(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    // put item on top of the stack
    public void push(char j) {
        // increment top, insert item
        stackArray[++top] = j;
    }

    // take item from top of the stack
    public char pop() {
        // access item, decrement top
        return stackArray[top--];
    }

    // return the value of the top
    public char peek() {
        return stackArray[top];
    }

    // true if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // true if stack is full
    public int size() {
        return top + 1;
    }

    // return item at index n
    public char peekN(int n) {
        return stackArray[n];
    }

    public void displayStack(String s) {
        System.out.println(s);
        System.out.print("Stack (bottom --> top): ");
        for (int j = 0; j < size(); j++) {
            System.out.print(peekN(j) + " ");
        }
        System.out.println(" ");
    }
}
