/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.advancedSorting.shellSort;

/**
 *
 * @author dannylantigua
 */
public class ShellSortApp {
    
    public static void main(String[] args) {
        int maxSize = 10;
        ArraySh arr;
        arr = new ArraySh(maxSize);
        
        // fill array with random numbers
        for (int j = 0; j < maxSize; j++){
            long n = (int)(java.lang.Math.random()*99);
            arr.insert(n);
        }
        
        arr.display();
        arr.shellSort();
        arr.display();
    }
}
