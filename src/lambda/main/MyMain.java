/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 27-Oct-20
 *  Time: 1:26 PM
 */
package lambda.main;

import lambda.myinerface.MyFunctionalInterface;

public class MyMain {
    public static void main(String[] args) {
        //we can define the behaviour
        //by writing lambda expression
        MyFunctionalInterface add = (x, y) -> {
            return x + y;
        };
        int result = add.operation(10,20);
        System.out.println("result = " + result);
    }
}
