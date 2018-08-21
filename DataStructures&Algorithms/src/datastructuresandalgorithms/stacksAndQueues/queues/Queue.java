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
public class Queue {

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    // put item at rear of queue
    public void insert(long j) {
        // deal with wraparound
        if (rear == maxSize - 1) {
            rear = -1;
        }
        //increment rear and insert
        queArray[++rear] = j;
        nItems++;
    }

    // take item from front of the queue
    public long remove() {
        // get value and increment the front
        long temp = queArray[front++];
        // deal with wraparound
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }
    
    public long peekFront(){
        return queArray[front];
    }
    
    public boolean isEmpty(){
        return (nItems == 0);
    }
    
    public boolean isFull(){
        return (nItems == maxSize);
    }
    
    public int size(){
        return nItems;
    }
}
