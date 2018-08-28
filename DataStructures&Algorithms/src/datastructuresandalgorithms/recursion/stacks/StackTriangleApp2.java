/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.recursion.stacks;

import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class StackTriangleApp2 {

    static int theNumber;
    static int theAnswer;
    static StackY theStack;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        theNumber = sc.nextInt();
        stackTriangle();
        System.out.println("Triangle= " + theAnswer);
    }

    public static void stackTriangle() {
        // make a stack
        theStack = new StackY(10000);
        // initialize answer
        theAnswer = 0;
        // until n is 1
        while (theNumber > 0) {
            // push value
            theStack.push(theNumber);
            // decrement value
            --theNumber;
        }
        // until stack is empty
        while (!theStack.isEmpty()) {
            // pop value
            int newN = theStack.pop();
            // add to anser
            theAnswer += newN;
        }
    }
}
