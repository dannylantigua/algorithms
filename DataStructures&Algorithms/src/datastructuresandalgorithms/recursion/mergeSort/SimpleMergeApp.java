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
// NO RECURSION
public class SimpleMergeApp {

    public static void main(String[] args) {
        int[] arrayA = {23, 47, 81, 95};
        int[] arrayB = {7, 14, 39, 55, 62, 74};
        int[] arrayC = new int[10];

        merge(arrayA, 4, arrayB, 6, arrayC);
        display(arrayC, 10);
    }

    public static void merge(int[] arrayA, int sizeA,
            int[] arrayB, int sizeB,
            int[] arrayC) {
        int aDex = 0, bDex = 0, cDex = 0;

        // netiher array empty
        while (aDex < sizeA && bDex < sizeB) {
            if (arrayA[aDex] < arrayB[bDex]) {
                arrayC[cDex++] = arrayA[aDex++];
            } else {
                arrayC[cDex++] = arrayB[bDex++];
            }
        }

        // arrayB is empty but arrayA isn't
        while (aDex < sizeA) {
            arrayC[cDex++] = arrayA[aDex++];
        }

        // arrayA is empty but arrayB isn't
        while (aDex < sizeB) {
            arrayC[cDex++] = arrayB[bDex++];
        }
    }

    public static void display(int[] theArray, int size) {
        for (int j = 0; j < size; j++) {
            System.out.print(theArray[j] + " ");
        }
        System.out.println(" ");
    }
}
