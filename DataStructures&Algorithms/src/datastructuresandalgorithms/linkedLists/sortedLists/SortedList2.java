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
public class SortedList2 {

    private Link first;

    // constructor to initialize
    public SortedList2() {
        first = null;
    }

    // constructor to initialize and copy array into the list
    public SortedList2(Link[] linkArr) {
        first = null;
        for (int j = 0; j < linkArr.length; j++) {
            insert(linkArr[j]);
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }

    // insert in order
    public void insert(Link key) {
        Link previous = null; // start at first
        Link current = first;

        // until the end of the list or key > current
        while (current != null && key.dData > current.dData) {
            previous = current;
            // go to next item
            current = current.next;
        }

        // at the begining of the list
        if (previous == null) {
            // first --> newLink
            first = key;
        } // not at the begining of the list
        else {
            // old prev --> newLink
            previous.next = key;
        }
        // newLink --> old current
        key.next = current;
    }

    public Link remove() {
        Link temp = first;
        // delete first
        first = first.next;
        return temp;
    }
}
