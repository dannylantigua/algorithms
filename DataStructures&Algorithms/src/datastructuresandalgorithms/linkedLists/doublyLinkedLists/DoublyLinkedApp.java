/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.linkedLists.doublyLinkedLists;

/**
 *
 * @author dannylantigua
 */
public class DoublyLinkedApp {
    
    public static void main(String[] args) {
        DoublyLinkedLists theList = new DoublyLinkedLists();
        
        // insert at front
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        
        // insert at rear
        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);
        
        // display list forward
        theList.displayForward();
        // display list backward
        theList.displayBackward();
        
        // delete first item
        theList.deleteFirst();
        // delete the last item
        theList.deleteLast();
        
        // delete item with a given key
        theList.deleteKey(11);
        
        // display list forward
        theList.displayForward();
        
        // insert 77 after 22
        theList.insertAfter(22, 77);
        // insert 88 after 33
        theList.insertAfter(33, 88);
        
        // display list forward
        theList.displayForward();
    }
}
