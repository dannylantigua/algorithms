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
public class Person {

    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a) {
        this.lastName = last;
        this.firstName = first;
        this.age = a;
    }

    public void displayPerson() {
        System.out.print("    Last Name: " + lastName + ", First Name: " + firstName);
        System.out.println(", Age : " + age);
    }

    public String getLast() {
        return lastName;
    }
}
