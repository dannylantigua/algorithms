/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.linkedLists.stacks;

/**
 *
 * @author dannylantigua
 */
public class Link {

    // data
    public long dData;
    // next Link in list
    public Link next;

    public Link(long d) {
        this.dData = d;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
