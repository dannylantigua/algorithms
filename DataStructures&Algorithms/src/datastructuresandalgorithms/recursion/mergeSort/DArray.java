/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.recursion.mergeSort;

/**
 *
 * @author dannylantigua
 */
public class DArray {

    private long[] a;
    private int nElems;

    public DArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println(" ");
    }

    //  called by main, provides the workspace
    public void mergeSort() {
        long[] workspace = new long[nElems];
        recMergeSort(workspace, 0, nElems - 1);
    }

    private void recMergeSort(long[] workspace, int lowerBound,
            int upperBound) {
        // if range is 1, no use sorting
        if (lowerBound == upperBound) {
            return;
        } else {
            // find midpoint
            int mid = (lowerBound + upperBound) / 2;
            // sort low half
            recMergeSort(workspace, lowerBound, mid);
            // sort high half
            recMergeSort(workspace, mid + 1, upperBound);
            //merge them
            merge(workspace, lowerBound, mid + 1, upperBound);
        }
    }

    private void merge(long[] workspace,
            int lowPtr, int highPtr, int upperBound) {
        // workspace index
        int j = 0;
        int lowerBound = lowPtr;;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1; // # of items

        while (lowPtr <= mid && highPtr <= upperBound) {
            if (a[lowPtr] < a[highPtr]) {
                workspace[j++] = a[lowPtr++];
            } else {
                workspace[j++] = a[highPtr++];
            }
        }

        while (lowPtr <= mid) {
            workspace[j++] = a[lowPtr++];
        }

        while (highPtr <= upperBound) {
            workspace[j++] = a[highPtr++];
        }

        for (j = 0; j < n; j++) {
            a[lowerBound + j] = workspace[j];
        }
    }
}
