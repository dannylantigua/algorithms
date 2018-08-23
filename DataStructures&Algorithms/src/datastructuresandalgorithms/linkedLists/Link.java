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
public class Link {

    // key
    public int iData;
    // data
    public double dData;
    // next Link in list
    public Link next;

    public Link(int id, double dd) {
        this.iData = id;
        this.dData = dd;
    }

    public void displayLink() {
        System.out.print("{ " + iData + ", " + dData + " } ");
    }
}
