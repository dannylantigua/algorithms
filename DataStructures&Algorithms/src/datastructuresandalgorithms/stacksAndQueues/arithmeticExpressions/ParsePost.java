/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.stacksAndQueues.arithmeticExpressions;

/**
 *
 * @author dannylantigua
 */
public class ParsePost {

    private StackY theStack;
    private String input;

    public ParsePost(String s) {
        input = s;
    }

    public int doParse() {
        theStack = new StackY(20);
        char ch;
        int j;
        int num1, num2, interAns;

        // for each char
        for (j = 0; j < input.length(); j++) {
            ch = input.charAt(j);
            // *diagnostic*
            theStack.displayStack(" " + ch + " ");
            // if it's a number
            if (ch >= '0' && ch <= '9') {
                theStack.push((int) (ch - '0'));  // push it
            } // if it's an opperator
            else {
                // pop perands
                num2 = theStack.pop();
                num1 = theStack.pop();
                // do arithmetic
                switch (ch) {
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                }// end switch
                // push result
                theStack.push(interAns);
            }// end else
        }// end for
        // get answer
        interAns = theStack.pop();
        return interAns;
    }
}
