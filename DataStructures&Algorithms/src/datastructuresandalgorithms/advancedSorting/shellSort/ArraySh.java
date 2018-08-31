/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.advancedSorting.shellSort;

/**
 *
 * @author dannylantigua
 */
public class ArraySh {

    private long[] theArray;
    private int nElems;

    public ArraySh(int max) {
        theArray = new long[max];
        nElems = 0;
    }

    // put elements into the array
    public void insert(long value) {
        theArray[nElems] = value;
        nElems++;
    }

    public void display() {
        System.out.print("A= ");
        for (int k = 0; k < nElems; k++) {
            System.out.print(theArray[k] + " ");
        }
        System.out.println("");
    }

    public void shellSort() {
        int inner, outer;
        long temp;

        // find initial vaue of h
        int h = 1;
        while (h <= nElems / 3) {
            h = h * 3 + 1; // 1, 4, 13, 30, 121...
        }

        // decreasing h, until h = 1
        while (h > 0) {
            // h-sort the file
            for (outer = h; outer < nElems; outer++) {
                temp = theArray[outer];
                inner = outer;

                // one subpass (eg 0, 4, 8)
                while (inner > h - 1 && theArray[inner - 1] >= temp) {
                    theArray[inner] = theArray[inner - h];
                    inner -= h;
                }
                theArray[inner] = temp;
            } // end of for
            // decrease h
            h = (h - 1) / 3;
        } // end of while
    }
}
