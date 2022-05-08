/* Given an interface in1 which includes a method display which takes an integer as input
 * interface In1
 * {
 * void display(int p);
 * }
 * Task is to write a class testClass which implements interface In1 and has a method named display
 * which takes an integer as an input p and the display method should be able to tell if the number is prime or not?
*/

package Assignment_01;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        testClass ob1 = new testClass();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ob1.display(num);
    }
}

interface in1 {
    void display(int p);
}

class testClass implements in1 {

    int temp;

    public void display(int p) {

        int i = 2;
        for (; i <= p / 2; i++) {
            if (p % i == 0) {
                System.out.println("Not a prime number");
                break;
            }
        }
        if (i > p / 2)
            System.out.println("Prime number");
    
    }
}