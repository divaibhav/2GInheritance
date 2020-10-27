/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 22-Oct-20
 *  Time: 1:27 PM
 */
package main;

import base.Person;
import derived.Employee;
import derived.Student;

public class MyMain {
    public static void main(String[] args) {
        Person p = new Student("vaibhav", "div",11,"BE", 4,7);
        p.display();
        //p.setRollNo(12);


    }
}
