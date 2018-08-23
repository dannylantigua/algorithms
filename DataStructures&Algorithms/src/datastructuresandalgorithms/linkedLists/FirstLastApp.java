/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.linkedLists;

/**
 *
 * @author dannylantigua
 */
public class FirstLastApp {

    public static void main(String[] args) {
        // make a new list
        FirstLastList theList = new FirstLastList();

        // insert 3 items at front
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);

        // insert e items at rear
        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);
        
        // display list
        theList.displayList();

        // delete 2 items
        theList.deleteFirst();
        theList.deleteFirst();

        // display list
        theList.displayList();
    }
}
