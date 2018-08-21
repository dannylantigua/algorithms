/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.stacksAndQueues.queues;

/**
 *
 * @author dannylantigua
 */
public class QueueApp {

    public static void main(String[] args) {
        QueueEnhaced theQ = new QueueEnhaced(5);

        // insert 4 items
        theQ.insert(10);
        theQ.insert(20);
        theQ.insert(30);
        theQ.insert(40);

        // remove 3 items
        theQ.remove();
        theQ.remove();
        theQ.remove();

        // insert 4 items
        // wraps  around
        theQ.insert(50);
        theQ.insert(60);
        theQ.insert(70);
        theQ.insert(80);

        // remove all and display
        while (!theQ.isEmpty()) {
            long n = theQ.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
