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
public class LinkListSearch {

    // reference to the first link of the list
    private Link first;

    public LinkListSearch() {
        // explicit example of how the linkedlist begins
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    // insert at the start of the list
    public void insertFirst(int id, double dd) {
        // create object
        Link newLink = new Link(id, dd);
        newLink.next = first;  // newLink --> old first
        first = newLink;    // first --> newLink
    }

    // find Link with given key
    public Link find(int key) {
        // start at first
        Link current = first;
        // while no match
        while (current.iData != key) {
            // if it reaches the end of the list
            if (current.next == null) {
                return null;
            } else {
                // move to the next
                current = current.next;
            }
        }
        // found it
        return current;
    }

    // delete link with given key
    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                // move to next link
                previous = current;
                current = current.next;
            }
        }
        // found it
        // if first link, change first
        if (current == first) {
            first = first.next;
        } else {
            // otherwise, bypass it
            previous.next = current.next;
        }
        return current;
    }

    public void displayList() {
        System.out.print("List (first-->Last): ");
        // start at the beginning of the list
        Link current = first;
        while (current != null) {
            current.displayLink();
            // move to the next link in the list
            current = current.next;
        }
        System.out.println("");
    }
}
