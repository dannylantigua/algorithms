/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.binaryTrees;

import java.util.Stack;

/**
 *
 * @author dannylantigua
 */
public class Tree {

    private Node root;

    public Tree() {
        root = null;
    }

    public Node find(int key) {

        Node current = root; // start at root
        // while no match
        while (current.iData != key) {
            // go left?
            if (key < current.dData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }

            if (current == null) {
                return null; // didn't find it
            }
        }
        // found it
        return current;
    }

    public void insert(int id, double dd) {

        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = dd;

        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.iData) { // go left?
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                    // end go left
                } else { // go right?
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                } // end go right
            } // end while
        } // end else not root
    }

    public boolean delete(int key) {

        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        // search fro node
        while (current.iData != key) {
            parent = current;
            if (key < current.iData) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {
                return false;
            }
        } // end while
        // found node to delete

        // if no children, simply delete it
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null; // tree is empty
            } else if (isLeftChild) { // disconnect from parent
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        } // if no right child, replace it with left subtree
        else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } // if no left child, replace with right subtree
        else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        } // two children, so replace wiht inorder succesor
        else {
            // get succesor of node to delete (current)
            Node successor = getSuccessor(current);

            // connect parent of current successor instead
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }

            // connect successor to current's left child
            successor.leftChild = current.leftChild;
        }// end else two children
        // (successor cannot have a left child)

        return true; // success
    }

    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild; // go to left child
        }

        // if successor not right child, make connections
        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }

        return successor;
    }

    public void traverse(int traverseType) {

        switch (traverseType) {
            case 1:
                System.out.print("\nPreorder traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.print("\nInorder traversal: ");
                inOrder(root);
                break;
            case 3:
                System.out.print("\nPostorder traversal: ");
                postOrder(root);
                break;
        }
        System.out.println("");
    }

    private void preOrder(Node localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.iData + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }
    }

    private void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.iData + " ");
        }
    }

    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("...............................................");

        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;

            for (int j = 0; j < nBlanks; j++) {
                System.out.print(" ");
            }

            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.iData);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);

                    if (temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }

                for (int j = 0; j < nBlanks * 2 - 2; j++) {
                    System.out.print(" ");
                }
            } // end while globalStack not empty

            System.out.println("");
            nBlanks /= 2;
            while (localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }
        } // end while isRowEmpty
        System.out.println("...............................................");
    }

}
