/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.sortingObjects;

/**
 *
 * @author dannylantigua
 */
public class ObjectSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        ArrayInOb arr;
        arr = new ArrayInOb(maxSize);
        
        // insert 10 items
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Doc", 59);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Smith", "Paul", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);
        
        System.out.println("Before sorting: ");
        arr.display();
        
        // sort them
        arr.insertionSort();
        
        System.out.println("After sorting: ");
        arr.display();
    }
}
