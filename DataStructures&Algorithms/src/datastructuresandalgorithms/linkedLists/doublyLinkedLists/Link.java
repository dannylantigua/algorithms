/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.linkedLists.doublyLinkedLists;

import datastructuresandalgorithms.linkedLists.sortedLists.*;

/**
 *
 * @author dannylantigua
 */
public class Link {

    // data item
    public long dData;
    // next link in list
    public Link next;
    // previous link in list
    public Link previous;

    public Link(long dd) {
        dData = dd;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
