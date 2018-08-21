/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.stacksAndQueues.queues;

/**
 *
 * @author dannylantigua
 */
public class PriorityQ {

    // array in sorted order, from max at 0 to min at size-1
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQ(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        int j;

        // if no items, insert a 0
        if (nItems == 0) {
            queArray[nItems++] = item;
        } else {
            // start at the end
            for (j = nItems - 1; j >= 0; j--) {
                // if new item is larger
                if (item > queArray[j]) {
                    // shift upward
                    queArray[j + 1] = queArray[j];
                } else {
                    // if smaller
                    break;
                }
            }//end for
            queArray[j + 1] = item;
            nItems++;

        }
    }

    // remove min item
    public long remove() {
        return queArray[--nItems];
    }

    // peek min item
    public long peekMin() {
        return queArray[nItems - 1];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}
