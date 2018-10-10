/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationtest;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dannylantigua
 */
public class JavaApplicationTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] myArr = {2, 3, 2, 4, 5, 12, 2, 3, 3, 12};
        
        // Linear way
        // variable count 
        // Another loop (nested loop)
        // O(n)2
        
        
    }
    
    public static int[] sortArray(int[] arr){
        // an empty
        // int[] sortedArr = new int[10];
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        int count;
        
        // outer loop
        for (int k = 0; k < arr.length; k++){
            count = 0;
            int j =1;
            while (j < arr.length){
                if (arr[k] == arr[j]){
                    count++;
                    myMap.put(arr[k], count);
                }
                j++;
            }
        }
        
        // iterate trough the Map
        for (int k = 0; k < myMap.size(); k++){
            //
            
        }
        
        return arr;
    }
    
    
    // 3, 3 --> 
    // 2, 3
    // 12, 2
}
