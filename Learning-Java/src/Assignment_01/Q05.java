/*
 * WAP in Java which would contain 8 objects of a Class Employee.
 * Employee contains name, age, department, salary. Your program would be able to
 * calculate the total salary to be paid in each department.
 * Use constructors to create these 8 objects and Scanner to take inputs.
 */

package Assignment_01;

import java.util.Scanner;
import java.util.Arrays;

public class Q05 {

    public static void main(String[] args) {
        Employee objs[] = new Employee[8];
        for (int i = 0; i < 3; i++)
            objs[i] = new Employee();
        Employee.display();
    }
}

class Employee {
    static String depArr[] = new String[100];
    static float salArr[] = new float[100];
    String name, dep;
    int age;
    float sal;

    Employee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name, Department, Age and Salary respectively: ");
        name = sc.next();
        dep = sc.next();
        age = sc.nextInt();
        sal = sc.nextFloat();
        if (sal > 30000)
            sal = 25000;
        for (int i = 0; i < 100; i++) {
            if (dep.equals(depArr[i])) {
                salArr[i] += sal;
                break;
            } else if (depArr[i] == null) {
                depArr[i] = dep;
                salArr[i] += sal;
                break;
            }
        }
    }

    static void display() {
        int i = 0;
        while (i < 100 && depArr[i] != null) {
            System.out.println(depArr[i] + " : " + salArr[i++]);
        }
    }
}