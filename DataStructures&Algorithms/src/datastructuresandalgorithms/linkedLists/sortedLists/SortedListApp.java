/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.linkedLists.sortedLists;

/**
 *
 * @author dannylantigua
 */
public class SortedListApp {

    public static void main(String[] args) {
        // make a new list
        SortedList theSortedList = new SortedList();

        // insert 2 items
        theSortedList.insert(20);
        theSortedList.insert(40);

        // display list
        theSortedList.displayList();

        // insert 3 items
        theSortedList.insert(10);
        theSortedList.insert(30);
        theSortedList.insert(50);

        // display again
        theSortedList.displayList();
        
        // remove item
        theSortedList.remove();
        theSortedList.displayList();
    }
}
