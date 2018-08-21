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
public class PostfixApp {

    public static void main(String[] args) {

        String input;
        int output;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter postfix: ");
            input = sc.nextLine();
            if (input.equals("")) {
                break;
            }

            ParsePost aParser = new ParsePost(input);
            // do the evaluation
            output = aParser.doParse();
            System.out.println("Evaluates to " + output);
        }
    }
}
