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
public class FactorialApp {

    static int number;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        number = sc.nextInt();
        int fact = factorial(number);
        System.out.println("Factorial: " + fact);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
}
