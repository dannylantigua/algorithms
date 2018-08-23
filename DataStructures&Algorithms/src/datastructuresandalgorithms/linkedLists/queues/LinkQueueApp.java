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
public class LinkQueueApp {
    
    public static void main(String[] args) {
        LinkQueue theQueue = new LinkQueue();
        
        // insert items
        theQueue.insert(20);
        theQueue.insert(40);
        
        // display queue
        theQueue.displayQueue();
        
        theQueue.insert(60);
        theQueue.insert(80);
        
        // display queue
        theQueue.displayQueue();
        
        // remove items
        theQueue.remove();
        theQueue.remove();
        
        // display queue
        theQueue.displayQueue();
    }
}
