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
public class StackTriangleApp {

    static int theNumber;
    static int theAnswer;
    static StackX theStack;
    static int codePart;
    static Params theseParams;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        theNumber = sc.nextInt();
        recTriangle();
        System.out.println("Triangle= " + theAnswer);
    }

    public static void recTriangle() {
        theStack = new StackX(1000);
        codePart = 1;
        while (step() == false) // call step until it's true
            ; // null statement
    }

    public static boolean step() {
        switch (codePart) {
            case 1: // initial call
                theseParams = new Params(theNumber, 6);
                theStack.push(theseParams);
                codePart = 2;
                break;
            case 2: // method entry
                theseParams = theStack.peek();
                if (theseParams.n == 1) {
                    theAnswer = 1;
                    codePart = 5; //exit
                } else {
                    codePart = 3; //recursive call
                }
                break;
            case 3: //method call
                Params newParams = new Params(theseParams.n - 1, 4);
                theStack.push(newParams);
                codePart = 2; // go enter method
                break;
            case 4: // calculation
                theseParams = theStack.peek();
                theAnswer = theAnswer + theseParams.n;
                codePart = 5;
                break;
            case 5: // method exit
                theseParams = theStack.peek();
                codePart = theseParams.returnAddress; // (4 or 6)
                theStack.pop();
                break;
            case 6: // return point
                return true;
        }
        return false;
    }
}
