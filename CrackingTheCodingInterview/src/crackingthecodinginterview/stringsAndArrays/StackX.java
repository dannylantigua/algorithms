/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview.stringsAndArrays;

/**
 *
 * @author dannylantigua
 */
public class StackX {

    private int maxSize;
    private char[] a;
    private int top; // top of the array

    public StackX(int s) {
        this.maxSize = s;
        a = new char[maxSize];
        top = -1;
    }
    
    public void push(char j){
        a[++top] = j; // inserting
    }
    
    public char pop(){
        return a[top--];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
}
