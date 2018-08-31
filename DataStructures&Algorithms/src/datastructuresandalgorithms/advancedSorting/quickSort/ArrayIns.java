/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.advancedSorting.quickSort;

/**
 *
 * @author dannylantigua
 */
public class ArrayIns {
    
    private long[] theArray;
    private int nElems;
    
    public ArrayIns(int max) {
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
    
    public void quickSort(){
        recQuickSort(0, nElems - 1);
    }
    
    public void recQuickSort(int left, int right) {
        // if size <= 1
        if (right - left <= 0) {
            // already sorted
            return;
        } else {
            // size 2 or larger
            // rightmost item
            long pivot = theArray[right];
            // partition range
            int partition = partitionIt(left, right, pivot);
            // sort left side
            recQuickSort(left, partition - 1);
            // sort right side
            recQuickSort(partition + 1, right);
        }
    }
    
    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1; // right or first element
        int rightPtr = right; // left of pivot

        while (true) {
            // find bigger item
            while (theArray[++leftPtr] < pivot)
                ;

            // find smaller item
            while (rightPtr > 0 && theArray[--rightPtr] > pivot)
                ;

            // if pointers cross, partition done
            if (leftPtr >= rightPtr) {
                break;
            } else {
                // swap elements
                swap(leftPtr, rightPtr);
            }
        }// end while
        // restore pivot
        swap(leftPtr, right);
        // return pivot location
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
