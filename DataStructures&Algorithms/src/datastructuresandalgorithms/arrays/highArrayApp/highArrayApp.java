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
public class highArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;
        // reference to the array 
        highArray arr;                 
        // create the array
        arr = new highArray(maxSize);  
        
        // insert 10 items
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        
        // display items
        arr.display();
        
        // get Max item
        long max = arr.getMax();
        if (max != -1){
            System.out.println("Maximum value is " + max);
            // remove it
            arr.removeMax(max);
        } else
            System.out.println("Array is empty"); 
        
        // search for an item
        int searchKey = 35;
        if (arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
        
        // delete 3 items
        arr.delete(00);
        arr.delete(55);
        arr.delete(22);
        
        // display the array again
        arr.display();
    }
}
