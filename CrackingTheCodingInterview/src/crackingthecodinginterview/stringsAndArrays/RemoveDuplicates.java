/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview.stringsAndArrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dannylantigua
 *
 * Design an algorithm and write code to remove the duplicate characters in a
 * string without using any additional buffer. NOTE: One or two additional
 * variables are fine. An extra copy of the array is not. FOLLOW UP Write the
 * test cases for this method
 *
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        String userInput;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        userInput = sc.nextLine();
        System.out.println(deleteDups(userInput));
    }

    // solution 1
    // Algorithm—No (Large) Additional Memory:
    public static void removeDuplicates(String str) {
        char[] arr = str.toCharArray();

        if (arr == null) {
            return;
        }
        int len = arr.length;
        if (len < 2) {
            return;
        }

        int tail = 1;
        for (int i = 1; i < len; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (j == tail) {
                arr[tail] = arr[i];
                ++tail;
            }
        }
        arr[tail] = 0;
    }

    // solution 2
    // Algorithm—With Additional Memory of Constant Size
    public static void removeDuplicatesEff(String str) {
        char[] arr = str.toCharArray();

        if (arr == null) {
            return;
        }
        int len = arr.length;
        if (len < 2) {
            return;
        }

        boolean[] hit = new boolean[256];
        for (int i = 0; i < 256; ++i) {
            hit[i] = false;
        }
        hit[arr[0]] = true;
        int tail = 1;
        for (int i = 1; i < len; ++i) {
            if (!hit[arr[i]]) {
                arr[tail] = arr[i];
                ++tail;
                hit[arr[i]] = true;
            }
        }
        arr[tail] = 0;
    }

    // solution 3
    public static String deleteDups(String str) {
        /*String result = "";
        boolean[] char_set = new boolean[256];
        
        for (int k = 0; k < str.length(); k++){
            int val = str.charAt(k);
            if (char_set[val]){
                str = str.substring(0, k) + str.substring(k+1);
            }
            char_set[val] = true;
        }*/

        char[] arr = str.toCharArray();
        boolean[] char_set = new boolean[256];

        for (int k = 0; k < arr.length; k++) {
            int val = arr[k];
            if (char_set[val]) {
                arr[k] = 0;

            }
            char_set[val] = true;
        }

        // move upper ones down
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0 && j != arr.length - 1) {
                //System.out.println("j: " + j);
                arr[j] = arr[j + 1];
                arr[j + 1] = 0;
            }
        }
        return new String(arr);
    }
}
