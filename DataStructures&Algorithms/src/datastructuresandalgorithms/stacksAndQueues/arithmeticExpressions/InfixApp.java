/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.stacksAndQueues.arithmeticExpressions;

import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class InfixApp {

    public static void main(String[] args) {

        String input, output;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter infix: ");
            input = sc.nextLine();
            if (input.equals("")) {
                break;
            }

            InToPost theTrans = new InToPost(input);
            // do the translation to postfix
            output = theTrans.doTrans();
            System.out.println("postfix is " + output);
        }
    }
}
