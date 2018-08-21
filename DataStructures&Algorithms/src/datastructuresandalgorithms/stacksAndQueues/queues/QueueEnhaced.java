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
public class QueueEnhaced {

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;

    public QueueEnhaced(int s) {
        // array must be one cell larger
        maxSize = s + 1;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
    }

    // put item at rear of queue
    public void insert(long j) {
        // deal with wraparound
        if (rear == maxSize - 1) {
            rear = -1;
        }
        //increment rear and insert
        queArray[++rear] = j;
    }

    // take item from front of the queue
    public long remove() {
        // get value and increment the front
        long temp = queArray[front++];
        // deal with wraparound
        if (front == maxSize) {
            front = 0;
        }
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (rear + 1 == front || (front + maxSize - 1 == rear));
    }

    public boolean isFull() {
        return (rear + 2 == front || (front + maxSize - 2 == rear));
    }

    // asumes queue is no empty
    public int size() {
        if (rear >= front) {
            return rear - front + 1;
        } else {
            return (maxSize - front) + (rear + 1);
        }
    }
}
