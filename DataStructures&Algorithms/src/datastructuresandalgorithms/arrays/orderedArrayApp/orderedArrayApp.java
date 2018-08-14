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
        orderedArray arr;
        arr = new orderedArray(maxSize);

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

        // display
        arr.display();

        // search for an item
        int searchKey = 55;
        if (arr.find(searchKey) != arr.size()) {
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
