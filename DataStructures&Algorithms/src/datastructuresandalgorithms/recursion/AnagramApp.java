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
public class AnagramApp {

    static int size;
    static int count;
    static char[] arrChar = new char[100];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // get word
        System.out.println("Enter a word: ");
        String input = sc.nextLine();
        // find the size
        size = input.length();
        count = 0;
        // put every character into the array
        for (int j = 0; j < size; j++) {
            arrChar[j] = input.charAt(j);
        }
        doAnagram(size);
    }

    public static void doAnagram(int newSize) {
        if (newSize == 1) { // if too small
            return; // go no further
        }
        // for each position
        for (int k = 0; k < newSize; k++) {
            doAnagram(newSize - 1); //anagram remaining
            if (newSize == 2) { // if innermost
                displayWord(); // display word
            }
            rotate(newSize); // rotate word
        }
    }

    // rotate left all characters from position to end
    public static void rotate(int newSize) {
        int j;
        int position = size - newSize;
        char temp = arrChar[position]; // save first letter
        // shift the rest
        for (j = position+1; j < size; j++) {
            arrChar[j - 1] = arrChar[j];
        }
        arrChar[j - 1] = temp; //put first on right
    }

    public static void displayWord() {
        if (count > 99) {
            System.out.print(" ");
        }
        if (count < 9) {
            System.out.print(" ");
        }

        System.out.print(++count + " ");
        for (int j = 0; j < size; j++) {
            System.out.print(arrChar[j]);
        }
        System.out.print("     ");

        if (count % 6 == 0) {
            System.out.println(" ");
        }
    }
}
