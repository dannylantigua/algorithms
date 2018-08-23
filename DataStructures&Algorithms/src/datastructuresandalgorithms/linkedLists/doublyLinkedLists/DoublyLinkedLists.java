/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.linkedLists.doublyLinkedLists;

/**
 *
 * @author dannylantigua
 */
public class DoublyLinkedLists {

    private Link first; // ref to first item
    private Link last; // ref to last item

    public DoublyLinkedLists() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    // insert at front of the list
    public void insertFirst(long dd) {
        // new link
        Link newLink = new Link(dd);

        if (isEmpty()) {
            // newLink <--- last
            last = newLink;
        } else {
            // newLink <--- old first
            first.previous = newLink;
        }
        // newLink ---> old first
        newLink.next = first;
        // first --> newLink
        first = newLink;
    }

    // insert at the end of the list
    public void insertLast(long dd) {
        Link newLink = new Link(dd);
        if (isEmpty()) {
            // first --> newLink
            first = newLink;
        } else {
            // old last --> newLink
            last.next = newLink;
            // old last <--- newLink
            newLink.previous = last;
        }
        // newLink <--- last
        last = newLink;
    }

    // delete first link of the list
    public Link deleteFirst() {
        Link temp = first;
        if (first.next == null) {
            last = null;
        } else {
            // null <-- old next
            first.next.previous = null;
        }
        // first --> old new
        first = first.next;
        return temp;
    }

    // delete last link of the list
    public Link deleteLast() {
        Link temp = last;
        // if only one item
        if (first.next == null) {
            // set first to null
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return last;
    }

    // insert link after a given key
    public boolean insertAfter(long key, long dd) {
        // start at the beginning
        Link current = first;
        // until match is found
        while (current.dData != key) {
            current = current.next;
            if (current == null) {
                // didn't find it
                return false;
            }
        }

        Link newLink = new Link(dd);

        // if last link
        if (current == last) {
            // make the newLink the last
            newLink.next = null;
            last = newLink;
        } else {
            // set the current.next and previous to newLink
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        // set the current next to newLink
        current.next = newLink;
        return true;
    }

    // delete a given key
    public Link deleteKey(long key) {
        Link current = first;

        // until match is found
        while (current.dData != key) {
            current = current.next;
            if (current == null) {
                // didn't find it
                return null;
            }
        }

        // found it in first item?
        if (current == first) {
            // first --> old next
            first = current.next;
        } else {
            // old previous <-- old next
            current.previous.next = current.next;
        }

        // last item
        if (current == last) {
            last = current.previous;
        } else {
            // old previous <-- old next
            current.next.previous = current.previous;
        }

        return current;
    }
    
    public void displayForward(){
        System.out.print("List (first-->last): ");
        // start at the beginning of the list
        Link current = first;
        while (current != null) {
            current.displayLink();
            // move to the next link in the list
            current = current.next;
        }
        System.out.println("");
    }
    
    public void displayBackward(){
        System.out.print("List (last-->first): ");
        // start at the end of the list
        Link current = last;
        while (current != null) {
            current.displayLink();
            // move to the previous link in the list
            current = current.previous;
        }
        System.out.println("");
    }
}
