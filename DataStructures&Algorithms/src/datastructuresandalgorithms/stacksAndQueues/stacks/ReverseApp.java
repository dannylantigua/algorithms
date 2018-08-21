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
public class ReverseApp {

    public static void main(String[] args) {
        String input, output;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a String: ");
            input = sc.nextLine();
            if (input.equals("")) {
                break;
            }

            Reverser rev = new Reverser(input);
            output = rev.doRev();
            System.out.println("Reversed string: " + output);
        }
    }
}
