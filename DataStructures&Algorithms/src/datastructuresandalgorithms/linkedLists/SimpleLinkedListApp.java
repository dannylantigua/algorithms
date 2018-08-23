/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.linkedLists;

/**
 *
 * @author dannylantigua
 */
public class SimpleLinkedListApp {

    public static void main(String[] args) {
        // make a new list
        LinkList theList = new LinkList();

        // insert 4 items
        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        // display list
        theList.displayList();

        while (!theList.isEmpty()) {
            // delete link and keep it in aLink
            Link aLink = theList.deleteFirst();
            System.out.print("Deleted ");
            aLink.displayLink();
            System.out.println("");
        }

        // display again
        theList.displayList();
    }
}
