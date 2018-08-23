/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.linkedLists.queues;

/**
 *
 * @author dannylantigua
 */
public class LinkQueue {
    
    private FirstLastList theList;
    
    public LinkQueue(){
        theList = new FirstLastList();
    }
    
    public boolean isEmpty(){
        return theList.isEmpty();
    }
    
    public void insert(long j){
        theList.insertLast(j);
    }
    
    public long remove(){
        return theList.deleteFirst();
    }
    
    public void displayQueue(){
        System.out.print("Queue (front ---> rear): ");
        theList.displayList();;
    }
}
