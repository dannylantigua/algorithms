/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.arrays.orderedArrayApp;

/**
 *
 * @author dannylantigua
 */
public class orderedArray {

    private long[] a;
    private int nElems;

    public orderedArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public long getA(int n) {
        return a[n];
    }

    public int size() {
        return nElems;
    }

    // find an elemen through Binary Search
    public int find(long searchKey, int low) {
        int lowerBound = low;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn; // found it
            } else if (lowerBound > upperBound) {
                return nElems; // can't find it at all
            } else {
                // let's divide the range
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void insert(long value) {
        int j;
        // find where it goes first
        for (j = 0; j < nElems; j++) {
            // j will stay with the index to insert the new value
            if (a[j] > value) {
                break;
            }
        }

        // move bigger ones up
        for (int k = nElems; k > j; k--) {
            a[k] = a[k - 1];
        }

        // by this time a[j] is empty
        // asign new value
        a[j] = value;
        nElems++; // adjust size
    }

    public boolean delete(long value) {
        // call the find method from above
        int j = find(value, 0);

        if (j == nElems) {
            return false; // didn't find it
        } else {
            moveBiggerOnesDown(j);
            return true; // found it
        }
    }

    public void moveBiggerOnesDown(int j) {
        // move bigger ones down
        for (int k = j; k < nElems; k++) {
            a[k] = a[k + 1];
        }
        nElems--; // adjust size
    }

    public void merge(long num1) {
        insert(num1);
    }

    public void noDups() {
        int curIn;
        for (int k = 0; k < nElems; k++) {
            curIn = find(a[k], k+1);
            if (curIn != k) {
                moveBiggerOnesDown(curIn);
            }
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println(" ");
    }
}
