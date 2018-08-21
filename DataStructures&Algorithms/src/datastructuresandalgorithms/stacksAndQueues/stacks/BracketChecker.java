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
public class BracketChecker {

    private String input;

    public BracketChecker(String in) {
        input = in;
    }

    public void check() {
        // get max stack size according to word's lenght
        int stackSize = input.length();
        // making the stack
        StackY theStack = new StackY(stackSize);

        for (int j = 0; j < input.length(); j++) {
            // get char form input
            char ch = input.charAt(j);
            switch (ch) {
                // opening symbols
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;

                // closing symbols
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()) {
                        char chk = theStack.pop();
                        if ((ch == '}' && chk != '{')
                                || (ch == ']' && chk != '[')
                                || (ch == ')' && chk != '(')) {
                            System.out.println("Error: " + ch + " at " + j);
                        }

                    } else {
                        System.out.println("Error: " + ch + " at " + j);
                    }
                    break;

                default:
                    break;
            }
        }

        // at this point, all characters have benn processed
        if (!theStack.isEmpty()) {
            System.out.println("Error: missing the right delimeter");
        }
    }
}
