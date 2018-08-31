/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.advancedSorting.partitioning;

/**
 *
 * @author dannylantigua
 */
public class ArrayPar {

    private long[] theArray;
    private int nElems;

    public ArrayPar(int max) {
        theArray = new long[max];
        nElems = 0;
    }

    // put elements into the array
    public void insert(long value) {
        theArray[nElems] = value;
        nElems++;
    }

    public int size() {
        return nElems;
    }

    public void display() {
        System.out.print("A= ");
        for (int k = 0; k < nElems; k++) {
            System.out.print(theArray[k] + " ");
        }
        System.out.println("");
    }

    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1; // right or first element
        int rightPtr = right + 1; // left of pivot

        while (true) {
            // find bigger item
            while (leftPtr < right && theArray[++leftPtr] < pivot)
                ;

            // find smaller item
            while (rightPtr > left && theArray[--rightPtr] > pivot)
                ;

            // if pointers cross, partition done
            if (leftPtr >= rightPtr) {
                break;
            } else {
                // swap elements
                swap(leftPtr, rightPtr);
            }
        }// end while
        return leftPtr;
    }

    // swap two elements
    public void swap(int dex1, int dex2) {
        long temp;
        temp = theArray[dex1]; // put A into temp
        theArray[dex1] = theArray[dex2]; // B into A
        theArray[dex2] = temp; // temp into B
    }
}
