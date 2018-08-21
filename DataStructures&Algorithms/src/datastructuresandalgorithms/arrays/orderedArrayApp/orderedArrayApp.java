/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.arrays.orderedArrayApp;

/**
 *
 * @author dannylantigua
 */
public class orderedArrayApp {
    
    

    public static void main(String[] args) {
        
        int maxSize = 100;
        orderedArray arr, arr2, arr3;
        
        arr = new orderedArray(maxSize);
        arr2 = new orderedArray(maxSize);
        arr3 = new orderedArray(maxSize);

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
        
        // insert 5 items in array 2
        arr2.insert(83);
        arr2.insert(14);
        arr2.insert(8);
        arr2.insert(61);
        arr2.insert(39);
        arr2.insert(55);

        // display
        arr.display();
        arr2.display();
        
        // merge
        for (int j = 0; j < arr.size(); j++){
            arr3.merge(arr.getA(j));
        }
        for (int j = 0; j < arr2.size(); j++){
            arr3.merge(arr2.getA(j));
        }
        
        // remove duplicates
        arr3.noDups();
        
        // display merged and no duplicates
        arr3.display();

        // search for an item
        int searchKey = 54;
        if (arr.find(searchKey, 0) != arr.size()) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can't find " + searchKey);
        }

        // delete 3 items
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();
    }
}
