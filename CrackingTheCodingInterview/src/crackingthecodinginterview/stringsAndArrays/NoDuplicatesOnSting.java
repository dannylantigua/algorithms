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
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures?
 * 
 */
public class NoDuplicatesOnSting {

    public static void main(String[] args) {
        String userInput;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        userInput = sc.nextLine();
        if (checkForNoDups(userInput)) {
            System.out.println("No duplicate characters in the string");
        } else {
            System.out.println("Duplicate characters exist in the string");
        }
    }

    // solution 1
    public static boolean isUniqueChars2(String str) {
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    // solution 2
    public static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    // solution 3
    public static boolean checkForNoDups(String str) {
        boolean ans = true;

        for (int j = 0; j < str.length(); j++) {
            if (j == str.length()) {
                ans = true;
            }

            for (int k = 0; k < str.length(); k++) {
                if ((str.charAt(k) == str.charAt(j))
                        && (k != j)) {
                    ans = false;
                } // end if
            }// end for
        } // end for
        return ans;
    }
}
