/*
 * WAP to count the total number of calls for a member function:
 * display(), from more than one objects and how many times the object is created of a class name Employee.
 * Note: Call display() function from more than 3 objects
 */

package Assignment_01;

public class Q07 {

    public static void main(String[] args) {
        Temp t = new Temp();
        Temp t1 = new Temp();
        Temp t2 = new Temp();
        t.fun();
        t1.fun();
        t2.fun();
        Temp.display();
    }
}

class Temp {
    static int c = 0, fc = 0;

    Temp() {
        c++;
    }

    void fun() {
        fc++;
    }

    static void display() {
        System.out.println("Objects created: " + c);
        System.out.print("Function called: " + fc);
    }
}
