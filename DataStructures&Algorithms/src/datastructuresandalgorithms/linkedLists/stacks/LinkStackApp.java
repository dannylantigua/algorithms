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
public class LinkStackApp {
    
    public static void main(String[] args) {
        // make the stack
        LinkStack theStack = new LinkStack();
        
        // push items
        theStack.push(20);
        theStack.push(40);
        
        // display
        theStack.displayStack();
        
        // push items
        theStack.push(60);
        theStack.push(80);
        
        // display
        theStack.displayStack();
        
        // pop items
        theStack.pop();
        theStack.pop();
        
        // display
        theStack.displayStack();
    }
}
