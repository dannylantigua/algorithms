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
public class LinkList {

    // reference to the first link of the list
    private Link first;

    public LinkList() {
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

    // delete first item (assumes list is not empty)
    public Link deleteFirst() {
        Link temp = first;
        // delete it: first --> old next
        first = first.next;
        return temp;
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
