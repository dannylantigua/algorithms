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
public class ListIterator {

    private Link current;
    private Link previous;
    private LinkList ourList;

    public ListIterator(LinkList list) {
        ourList = list;
        reset();
    }

    // start at first
    public void reset() {
        current = ourList.getFirst();
        previous = null;
    }

    // true if last link
    public boolean atEnd() {
        return (current.next == null);
    }

    // go to next link
    public void nextLink() {
        previous = current;
        current = current.next;
    }

    // get current link
    public Link getCurrent() {
        return current;
    }

    // insert after
    public void insertAfter(long dd) {
        Link newLink = new Link(dd);
        // empty list
        if (ourList.isEmpty()) {
            ourList.setFrist(newLink);
            current = newLink;
        } else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink(); // point to newLink
        }
    }

    // insert before
    public void insertBefore(long dd) {
        Link newLink = new Link(dd);
        // beginning of list or empty list
        if (previous == null) {
            newLink.next = ourList.getFirst();
            ourList.setFrist(newLink);
            reset();
        } else {
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }

    // delete item at current
    public long deleteCurrent() {
        long value = current.dData;
        // beginning of list
        if (previous == null) {
            ourList.setFrist(current.next);
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }
        return value;
    }
}
