/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.linkedLists.iterator;

import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class InterIterApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        LinkList theList = new LinkList();
        ListIterator iter1 = theList.getIterator();
        long value;
        boolean go = true;

        // insert items
        iter1.insertAfter(20);
        iter1.insertAfter(40);
        iter1.insertAfter(80);
        iter1.insertBefore(60);

        while (go) {
            System.out.println("Enter first letter to show, reset, ");
            System.out.println("next, get, before, after, delete, exit(x): ");
            // get user's option
            int choice = getChar();

            switch (choice) {
                case 's': // show list
                    if (!theList.isEmpty()) {
                        theList.displayList();
                    } else {
                        System.out.println("List is empty");
                    }
                    break;
                case 'r': // reset
                    iter1.reset();
                    break;
                case 'n': // advance to next item
                    if (!theList.isEmpty() && !iter1.atEnd()) {
                        iter1.nextLink();
                    } else {
                        System.out.println("Can't go to next link");
                    }
                    break;
                case 'g': //get current item
                    if (!theList.isEmpty()) {
                        value = iter1.getCurrent().dData;
                        System.out.println("Returned " + value);
                    } else {
                        System.out.println("List is empty");
                    }
                    break;
                case 'b': // insert before current
                    System.out.println("Enter value to insert");
                    value = getInt();
                    iter1.insertBefore(value);
                    break;
                case 'a': // insert after current
                    System.out.println("Enter value to insert");
                    value = getInt();
                    iter1.insertAfter(value);
                    break;
                case 'd': // delete current item
                    if (!theList.isEmpty()) {
                        value = iter1.deleteCurrent();
                        System.out.println("Deleted " + value);
                    } else {
                        System.out.println("Can't delete");
                    }
                    break;
                case 'x':
                    System.out.println("Exiting now");
                    go = false;
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

    public static char getChar() {
        String s = sc.nextLine();
        return s.charAt(0);
    }

    public static int getInt() {
        String s = sc.nextLine();
        return Integer.parseInt(s);
    }
}
