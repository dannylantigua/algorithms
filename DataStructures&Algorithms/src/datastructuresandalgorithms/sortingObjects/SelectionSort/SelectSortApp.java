/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.sortingObjects.SelectionSort;

/**
 *
 * @author dannylantigua
 */
public class SelectSortApp {

    public static void main(String[] args) {
        int maxsize = 100;
        ArraySel arr;
        arr = new ArraySel(maxsize);

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
        
        arr.display();
        
        // sort them
        arr.selectionSort();
        
        // display them again
        arr.display();
    }
}
