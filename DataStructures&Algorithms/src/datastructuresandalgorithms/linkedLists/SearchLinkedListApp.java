/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.linkedLists;

/**
 *
 * @author dannylantigua
 */
public class SearchLinkedListApp {

    public static void main(String[] args) {
        // make a new list
        LinkListSearch theList = new LinkListSearch();

        // insert 4 items
        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        // display list
        theList.displayList();

        // find item
        Link f = theList.find(44);
        if (f != null) {
            System.out.println("Found link with key " + f.iData);
        } else {
            System.out.println("Can't find link");
        }

        // delete item
        Link d = theList.delete(66);
        if (d != null) {
            System.out.println("Deleted link with key " + d.iData);
        } else {
            System.out.println("Can't delete link");
        }

        // display list
        theList.displayList();
    }
}
