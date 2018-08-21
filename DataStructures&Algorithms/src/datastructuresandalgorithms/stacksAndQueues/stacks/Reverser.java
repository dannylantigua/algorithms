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
public class Reverser {

    private String input, output;

    public Reverser(String in) {
        input = in;
    }

    public String doRev() {
        // get max stack size according to word's lenght
        int stackSize = input.length();
        // making the stack
        StackY theStack = new StackY(stackSize);

        for (int j = 0; j < input.length(); j++) {
            // get char form input
            char ch = input.charAt(j);
            theStack.push(ch);
        }

        output = "";
        while (!theStack.isEmpty()) {
            // pop the char from stack
            char ch = theStack.pop();
            // append it to the output
            output += ch;
        }

        return output;
    }
}
