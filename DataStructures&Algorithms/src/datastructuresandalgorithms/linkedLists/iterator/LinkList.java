/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.linkedLists.iterator;

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

    // get the value of first
    public Link getFirst() {
        return first;
    }

    // set first to newLink
    public void setFrist(Link f) {
        first = f;
    }

    // return iterator
    public ListIterator getIterator() {
        return new ListIterator(this);
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            // move to the next link in the list
            current = current.next;
        }
        System.out.println("");
    }
}
