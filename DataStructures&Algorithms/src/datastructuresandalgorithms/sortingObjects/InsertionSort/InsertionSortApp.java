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
public class InsertionSortApp {

    public static void main(String[] args) {
        int maxsize = 10000;
        ArrayIns arr;
        arr = new ArrayIns(maxsize);

        // insert 10 items
//        arr.insert(77);
//        arr.insert(99);
//        arr.insert(44);
//        arr.insert(55);
//        arr.insert(22);
//        arr.insert(88);
//        arr.insert(11);
//        arr.insert(00);
//        arr.insert(66);
//        arr.insert(33);
        
        // inserting random items
        for (int j = 0; j < maxsize; j++){
            long n = (long)(java.lang.Math.random()*(maxsize -1));
            arr.insert(n);
        }
        
        // inserting descending ordered items
        /*for (int k = maxsize-1; k > 0; k--) {
            arr.insert(k);
        }*/
        
        // inserting ascending ordered items
        /*for (int k = 1; k < maxsize ; k++) {
            arr.insert(k);
        }*/
        
        arr.display();
        
        // sort them
        arr.insertionSort();
        
        // display them again
        arr.display();
    }
}
