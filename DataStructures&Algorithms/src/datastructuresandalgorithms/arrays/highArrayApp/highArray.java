/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.arrays.highArrayApp;

/**
 *
 * @author dannylantigua
 */
public class highArray {

    // ref to array a
    private long[] a;     
    // number of data items
    private int nElems;                                                         

    public highArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    //Linear search in the array
    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            // found it? 
            if (a[j] == searchKey)                                              
                break; // exit before loop ends                                                          
        }
        
        // reached the end of the array??
        if (j == nElems)                                                        
            return false;  // Didn't find it                                                    
        else
            return true;  // Found it                                                     
    }
    
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }
    
    public boolean delete(long value){
        int j;
        // search for it first. Linear search
        for (j = 0; j < nElems; j++){                                           
            if (value == a[j])
                break;
        }
        
        // reached the end of the array??
        if (j == nElems)                                                        
            return false;  // Didn't find it                                                      
        else{
            // Found it. Iterate each element
            for (int k = j; k < nElems; k++)                                    
                a[k] = a[k+1]; // re-arrange them by assigning them                                               
            nElems--;
            return true;
        }
    }
    
    public long getMax(){
        long max = 0;
        
        // check if array is empty
        if (nElems == 0)
            return -1;
        
        // search trough the array. Linear search
        for (int j = 0; j < nElems; j++)
            if (a[j] > max)
                max = a[j];
        
        return max;
    } 
    
    public void removeMax(long value){
        delete(value);
    }
    
    public void display(){
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println(" ");
    }
}
