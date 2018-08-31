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
public class PartitionApp {
    
    public static void main(String[] args) {
        int maxSize = 10;
        ArrayPar arr;
        arr = new ArrayPar(maxSize);
        
        // fill array with random numbers
        for (int j = 0; j < maxSize; j++){
            long n = (int)(java.lang.Math.random()*199);
            arr.insert(n);
        }
        
        arr.display();
        
        long pivot = 99;  // pivot value
        int size = arr.size();
        
        // partition the array
        int partDex = arr.partitionIt(0, size-1, pivot);
        
        System.out.println("Partition is at index " + partDex);
        arr.display();
    }
}
