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
public class SortedList {

    private Link first;

    public SortedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    // insert in order
    public void insert(long key) {
        Link newLink = new Link(key);
        Link previous = null;
        Link current = first;

        // until the end of the list or key > current
        while (current != null && key > current.dData) {
            previous = current;
            // go to next item
            current = current.next;
        }

        // at the begining of the list
        if (previous == null) {
            // first --> newLink
            first = newLink;
        } // not at the begining of the list
        else {
            // old prev --> newLink
            previous.next = newLink;
        }
        // newLink --> old current
        newLink.next = current;
    }
    
    public Link remove(){
        Link temp = first;
        // delete first
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
