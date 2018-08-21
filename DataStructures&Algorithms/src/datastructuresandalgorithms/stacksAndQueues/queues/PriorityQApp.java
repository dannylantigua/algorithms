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
public class PriorityQApp {

    public static void main(String[] args) {
        PriorityQ thePQ = new PriorityQ(5);

        // insert 4 items
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);

        // remove all and display
        while (!thePQ.isEmpty()) {
            long item = thePQ.remove();
            System.out.print(item + " ");
        }
        System.out.println("");
    }

}
