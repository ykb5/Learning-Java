/*
 * Create a multi-level inheritance hierarchy from ClassOne, ClassTwo, ClassThree classes.
 * ClassOne contains one, single parameterized constructor
 * ClassTwo contains only a default constructor
 * ClassThree contains one, single parameterized constructor and a default constructor.
 * Create an object of top child class and make sure the constructor execution will take place
 * according to respective multi-level inheritance hierarchy.
 * ClassThree obj = new ClassThree(1);
 * ClassThree obj = new ClassThree();
 */

package Assignment_01;

public class Q04 {

    public static void main(String[] args) {
        ClassThree ob1 = new ClassThree(1);
        ClassThree ob2 = new ClassThree();
    }
}

class ClassOne {
    ClassOne(int x) {
        System.out.println("ClassOne");
    }
}

class ClassTwo extends ClassOne {
    ClassTwo() {
        super(1);
        System.out.println("Second Default constructor");
    }
}

class ClassThree extends ClassTwo {
    ClassThree() {
        System.out.println("ClassThird");
    }

    ClassThree(int x) {
        System.out.println("Third default constructor");
    }
}