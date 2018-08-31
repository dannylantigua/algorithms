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
public class QuickSort3App {
    
    public static void main(String[] args) {
        int maxSize = 16;
        ArrayIns3 arr;
        arr = new ArrayIns3(maxSize);
        
        // fill array with random numbers
        for (int j = 0; j < maxSize; j++){
            long n = (int)(java.lang.Math.random()*99);
            arr.insert(n);
        }
        
        arr.display();
        arr.quickSort();
        arr.display();
    }
}
