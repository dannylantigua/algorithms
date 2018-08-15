/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.sortingObjects.InsertionSort;

/**
 *
 * @author dannylantigua
 */
public class ArrayIns {
    
    private long[] a;
    private int nElems;
    
    public ArrayIns(int max){
        a = new long[max];
        nElems = 0;
    }
    
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }
    
    public void display(){
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println(" ");
    }
    
    public void insertionSort(){
        int out, in;
        
        //outter loop
        for (out = 1; out < nElems; out++){
            // remove marked item to temp
            long temp = a[out];
            in = out;
            // start shifting the elements
            while (in > 0 && a[in-1] >= temp){
                a[in] = a[in-1];
                in--;
            }
            a[in] = temp;
        }
    }
}
