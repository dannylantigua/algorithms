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
// For Double-Ended Lists
public class FirstLastList {

    // reference to the first link of the list
    private Link2 first;
    private Link2 last;

    public FirstLastList() {
        // explicit example of how the linkedlist begins
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    // insert at the start of the list
    public void insertFirst(long dd) {
        // create object
        Link2 newLink = new Link2(dd);

        if (isEmpty()) {
            // newlink <---- last
            last = newLink;
        }
        newLink.next = first;  // newLink --> old first
        first = newLink;    // first --> newLink
    }

    // insert at end of the list
    public void insertLast(long dd) {
        Link2 newLink = new Link2(dd);

        if (isEmpty()) {
            first = newLink; // first --> newLink
        } else {
            last.next = newLink;  // old last --> newLink
        }
        last = newLink;  // first ---> newLink
    }

    // delete the first link
    public long deleteFirst() {
        long temp = first.dData;
        if (first.next == null) {
            last = null; // null <-- last
        }
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->Last): ");
        // start at the beginning of the list
        Link2 current = first;
        while (current != null) {
            current.displayLink();
            // move to the next link in the list
            current = current.next;
        }
        System.out.println("");
    }
}
