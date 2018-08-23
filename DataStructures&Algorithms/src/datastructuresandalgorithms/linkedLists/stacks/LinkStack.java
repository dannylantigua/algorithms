/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.linkedLists.stacks;

/**
 *
 * @author dannylantigua
 */
public class LinkStack {
    
    private LinkList theList;
    
    public LinkStack(){
        theList = new LinkList();
    }
    
    // put item into the stack
    public void push(long j){
        theList.insertFirst(j);
    }
    
    // take item from top of stack
    public long pop(){
        return theList.deleteFirst();
    }
    
    public boolean isEmpty(){
        return (theList.isEmpty());
    }
    
    public void displayStack(){
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }
}
