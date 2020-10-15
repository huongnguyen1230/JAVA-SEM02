package JAVA_11.test;

import JAVA_11.Date;
import JAVA_11.Employee;

public class testEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(001, "Nguyen", "Huong", 500);
        System.out.println(e1);

        //test setters and getters
        e1.setSalary(500);
        System.out.println(e1);
        //
        System.out.println("id " + e1.getID());
        System.out.println("firstname is " + e1.getFirstName());
        System.out.println("lastname is " + e1.getLastName());
        System.out.println("salary is" + e1.getSalary());

        System.out.println("annual salary " + e1.getAnnualSalary());
    }
}
