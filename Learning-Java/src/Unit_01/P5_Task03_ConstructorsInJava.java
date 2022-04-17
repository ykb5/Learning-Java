package Unit_01;

/*
 - There are two types of constructors in java
 			-Parameterized constructor
 			-Default constructor
 */

public class P5_Task03_ConstructorsInJava {

    public static void main(String[] args) {

        ABC4 obj = new ABC4();
        ABC4 obj1 = new ABC4(1);

        System.out.println(obj.a);
        System.out.println(obj1.a);

    }
}

class ABC4 {
    int a;

    /*
     * ClassName(Constructor Parameters){
     * All the class and instance variables are initialized here!
     * }
     */
    
    ABC4() {
        a = 10;
    }

    ABC4(int a) {
        this.a = a;
    }

    void display() {

        int b = 10;

        System.out.println(a);

        System.out.println(b);

    }

    int display2() {

        System.out.println(a);

        // As a was a local variable so we cannot access it outside the method
        // System.out.println(b);

        return a;

    }
}