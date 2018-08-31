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
public class ArrayIns3 {

    private long[] theArray;
    private int nElems;

    public ArrayIns3(int max) {
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

    public void quickSort() {
        recQuickSort(0, nElems - 1);
        // insertionSort(0, nElems - 1); // the other option
    }

    public void recQuickSort(int left, int right) {
        int size = right - left + 1;

        if (size < 10) {
            // manual sort if small
            insertionSort(left, right);
        } else {
            // quicksort if larger
            long median = medianOf3(left, right);
            // partition range
            int partition = partitionIt(left, right, median);
            // sort left side
            recQuickSort(left, partition - 1);
            // sort right side
            recQuickSort(partition + 1, right);
        }
    }

    public long medianOf3(int left, int right) {
        int center = (left + right) / 2;

        // order left and canter
        if (theArray[left] > theArray[center]) {
            swap(left, center);
        }

        // order left and right
        if (theArray[left] > theArray[right]) {
            swap(left, right);
        }

        // order center and right
        if (theArray[center] > theArray[right]) {
            swap(center, right);
        }

        // put pivot on right
        swap(center, right - 1);
        // return median value
        return theArray[right - 1];
    }

    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left; // right or first element
        int rightPtr = right - 1; // left of pivot

        while (true) {
            // find bigger item
            while (theArray[++leftPtr] < pivot)
                ;

            // find smaller item
            while (theArray[--rightPtr] > pivot)
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
        swap(leftPtr, right - 1);
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

    public void insertionSort(int left, int right) {
        int in, out;

        // sorted on left of out
        for (out = left + 1; out <= right; out++) {
            long temp = theArray[out];
            in = out;
            while (in > left && theArray[in - 1] >= temp) {
                // shit item to right
                theArray[in] = theArray[in - 1];
                // go left on position
                --in;
            } // end while
            // inserted marked item
            theArray[in] = temp;
        } // end for
    }
}
