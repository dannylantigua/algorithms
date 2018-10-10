/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.binaryTrees;

/**
 *
 * @author dannylantigua
 */
public class Node {

    public int iData;
    public double dData;
    public Node leftChild;
    public Node rightChild;

    public void displayNode() {
        System.out.print("{");
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }
}
