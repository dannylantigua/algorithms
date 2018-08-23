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
public class Link2 {

    // data
    public long dData;
    // next Link in list
    public Link2 next;

    public Link2(long d) {
        this.dData = d;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
