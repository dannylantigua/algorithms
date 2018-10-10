/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.binaryTrees;

import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class TreeApp {

    static Scanner mySc = new Scanner(System.in);

    public static void main(String[] args) {

        int value;
        Tree theTree = new Tree();

        theTree.insert(50, 1.5);
        theTree.insert(25, 1.2);
        theTree.insert(75, 1.7);
        theTree.insert(12, 1.5);
        theTree.insert(37, 1.2);
        theTree.insert(43, 1.7);
        theTree.insert(30, 1.5);
        theTree.insert(33, 1.2);
        theTree.insert(87, 1.7);
        theTree.insert(93, 1.5);
        theTree.insert(97, 1.5);

        while (true) {
            System.out.print("Enter first letter of show, ");
            System.out.print("insert, find, delete, or traverse:   ");
            int choice = getChar();

            switch (choice) {
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.println("Enter value to insert: ");
                    value = getInt();
                    theTree.insert(value, value + 0.9);
                    break;
                case 'f':
                    System.out.println("Enter value to find: ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found != null) {
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.println("");
                    } else {
                        System.out.println("Could not find " + value);
                    }
                    break;
                case 'd':
                    System.out.println("Enter value to delete: ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete) {
                        System.out.println("Deleted " + value);
                    } else {
                        System.out.println("Could not delete " + value);
                    }
                    break;
                case 't':
                    System.out.println("Enter type 1, 2, or 3: ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

    public static char getChar() {
        String s = mySc.nextLine();
        return s.charAt(0);
    }

    public static int getInt() {
        String s = mySc.nextLine();
        return Integer.parseInt(s);
    }
}
