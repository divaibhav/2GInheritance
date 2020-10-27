/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 27-Oct-20
 *  Time: 1:38 PM
 */
package lambda.databean;

public class Student {
    private int rollNo;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
