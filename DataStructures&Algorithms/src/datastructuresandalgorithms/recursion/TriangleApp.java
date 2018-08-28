/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.recursion;

import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class TriangleApp {

    static int theNumber;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        theNumber = sc.nextInt();
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle = " + theAnswer);
    }

    public static int triangle(int n) {
        System.out.println("Entering: n=" + n);
        if (n == 1) {
            System.out.println("Returning 1");
            return 1;
        } else {
            int temp = n + triangle(n - 1);
            System.out.println("Returning " + temp);
            return temp;
        }
    }
}
