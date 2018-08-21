/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.stacksAndQueues.stacks;

import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class BracketsApp {

    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter string containing delimeters: ");
            input = sc.nextLine();
            if (input.equals("")) {
                break;
            }

            BracketChecker checker = new BracketChecker(input);
            checker.check();
        }
    }
}
