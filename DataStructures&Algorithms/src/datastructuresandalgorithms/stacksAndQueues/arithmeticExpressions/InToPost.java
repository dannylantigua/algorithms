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
public class InToPost {
    
    private StackX theStack;
    private String input;
    private String output = "";
    
    public InToPost(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new StackX(stackSize);
    }

    // do translation to postfix
    public String doTrans() {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            // *diagnostic*
            theStack.displayStack("For " + ch + " ");
            switch (ch) {
                case '+':
                case '-':
                    getOper(ch, 1); // go pop opperators (precedence 1)
                    break;
                case '*':
                case '/':
                    getOper(ch, 2); // go pop opperators (precedence 1)
                    break;
                case '(':
                    theStack.push(ch); // push it
                    break;
                case ')':
                    gotParen(ch); // go pop operators
                    break;
                default:
                    output = output + ch; // must be an operand. Output it
                    break;
            } // end of swithc
        } // end of for

        // pop remaining operands
        while (!theStack.isEmpty()) {
            // *diagnostic*
            theStack.displayStack("While ");
            // write it to output
            output = output + theStack.pop();
        }
        // *diagnostic*
        theStack.displayStack("End ");
        // return postfix
        return output;
    }

    // get operator from input
    public void getOper(char opThis, int prec1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') { // if it's a '('
                // restore '('
                theStack.push(opTop);
                break;
            } // it's an operator
            else {
                int prec2;
                if (opTop == '+' || opTop == '-') {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }

                // if prec of new op less than prec of old
                if (prec2 < prec1) {
                    // save newly-popped up
                    theStack.push(opTop);
                    break;
                } // prec of new top not less than prec of old
                else {
                    output = output + opTop;
                }
            } // end else (it's an operator)
        } // end while
        theStack.push(opThis);
    }

    // got right parenthesis from input
    public void gotParen(char ch) {
        while (!theStack.isEmpty()) {
            char chk = theStack.pop();
            // if popped '('
            if (chk == '(') {
                break; // done
            } // if popped operator
            else {
                // output it
                output = output + chk;
            }
        }
    }
}
