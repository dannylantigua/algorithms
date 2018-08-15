/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.sortingObjects;

/**
 *
 * @author dannylantigua
 */
public class ArrayInOb {

    private Person[] p;
    private int nElems;

    public ArrayInOb(int max) {
        p = new Person[max];
        nElems = 0;
    }

    public void insert(String last, String first, int age) {
        p[nElems] = new Person(last, first, age);
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            p[j].displayPerson();
        }
        System.out.println("");
    }

    public void insertionSort() {
        int in, out;

        for (out = 1; out < nElems; out++) {
            Person temp = p[out];
            in = out;
            while (in > 0
                    && p[in - 1].getLast().compareTo(temp.getLast()) > 0) {
                p[in] = p[in - 1];
                in--;
            }
            p[in] = temp;
        }
    }
}
