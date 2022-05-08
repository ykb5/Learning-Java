/*
 * WAP to count the total number of calls for a member function from more than one objects.
 * [Let�s say, from 3 such Objects]
*/

package Assignment_01;

public class Q02 {

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        Test t4 = new Test();
        t1.temp();
        t2.temp();
        t3.temp();
        t4.temp();
        Test.counts();
    }

}

class Test {
    static int ct = 0;

    public void temp() {
        ct++;
    }

    static void counts() {
        System.out.println("Total counts: " + ct);
    }
}