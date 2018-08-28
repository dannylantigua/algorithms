/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.recursion.binarySearch;

/**
 *
 * @author dannylantigua
 */
public class ordArray {

    private long[] a;
    private int nElems;

    public ordArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        return recFind(searchKey, 0, nElems - 1);
    }

    private int recFind(long searchKey, int lowerBound, int upperBound) {
        int curIn;

        curIn = (lowerBound + upperBound) / 2;
        if (a[curIn] == searchKey) { // found it
            return curIn; // return it
        } else if (lowerBound > upperBound) {
            return nElems;
        } else { // let's divide
            if (a[curIn] < searchKey) { // the answer it's in the upper half
                return recFind(searchKey, curIn + 1, upperBound);
            } else { // the answer is in the lower half
                return recFind(searchKey, lowerBound, curIn - 1);
            }
        }
    }

    public void insert(long value) {
        int j;
        // find in which pisition it goes. Linear search
        for (j = 0; j < nElems; j++) {
            if (a[j] > value) {
                break;
            }
        }

        // movie bigger ones up
        for (int k = nElems; k > j; k--) {
            a[k] = a[k - 1];
        }
        // insert new value
        a[j] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println(" ");
    }
}
