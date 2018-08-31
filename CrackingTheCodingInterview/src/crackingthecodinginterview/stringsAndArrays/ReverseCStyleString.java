/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview.stringsAndArrays;

import java.util.Scanner;

/**
 *
 * @author dannylantigua
 *
 * Write code to reverse a C-Style String. (C-String means that “abcd” is
 * represented as five characters, including the null character )
 *
 */
public class ReverseCStyleString {

    public static void main(String[] args) {
        String userInput;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        userInput = sc.nextLine();
        System.out.println(reverseThatString(userInput));
    }

    // solution 2
    public static String reverse(String str) {
        char[] strCh = str.toCharArray();
        int k = 0;
        int j = strCh.length - 1;
        char temp;

        while (k < j) {
            temp = strCh[j];
            strCh[j] = strCh[k];
            strCh[k] = temp;
            k++;
            j--;
        }

        return new String(strCh);
    }

    // solution 1
    public static String reverseThatString(String str) {
        // insert it into an array
        char[] strCh = str.toCharArray();
        int k;

        // push elements into the stack
        StackX theStack = new StackX(strCh.length);
        for (k = 0; k < str.length(); k++) {
            theStack.push(strCh[k]);
        }

        // pop the elements back into the char array
        k = 0;
        while (!theStack.isEmpty()) {
            strCh[k] = theStack.pop();
            k++;
        }

        return new String(strCh);
    }
}
