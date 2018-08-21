/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.stacksAndQueues.stacks;

/**
 *
 * @author dannylantigua
 */
public class StackApp {

    public static void main(String[] args) {
        
        StackX theStack = new StackX(10);
        
        // pushing items into the stack
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        
        // while the stack is NOT empty
        while (!theStack.isEmpty()){
            // delete item from stack
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
