/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.linkedLists.sortedLists;

import java.util.Random;

/**
 *
 * @author dannylantigua
 */
public class ListInsertionSortApp {

    public static void main(String[] args) {
        int size = 10;
        Random rn = new Random();

        // create array of links
        Link[] linkArray = new Link[size];

        // fill array with links of random numbers
        for (int j = 0; j < linkArray.length; j++) {
            // generate the random number
            int n = rn.nextInt(100) + 1;
            // create Link object
            Link newLink = new Link(n);
            // assign object to array in position j
            linkArray[j] = newLink;
        }

        // display array contents
        for (int j = 0; j < linkArray.length; j++) {
            System.out.print(linkArray[j].dData + " ");
        }
        System.out.println(" ");

        // creating a new LinkedList passing the array
        SortedList2 theList = new SortedList2(linkArray);

        // get lonks from SortedList to array
        for (int j = 0; j < linkArray.length; j++) {
            linkArray[j] = theList.remove();
        }

        // display array contents, already sorted
        System.out.println("Sorted Array: ");
        for (int j = 0; j < linkArray.length; j++) {
            System.out.print(linkArray[j].dData + " ");
        }
    }
}
