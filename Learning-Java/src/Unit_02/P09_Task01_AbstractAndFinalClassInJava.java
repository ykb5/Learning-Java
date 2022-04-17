package Unit_02;

/*
  	- Abstract Class
  		  Abstract class may consists of abstract and non-abstract method.
  		 -(0-100%) abstract methods can be there !
  		 
  	In case of Interface 100% abstract method should be there!
  	
  	- Final class
 */

abstract class Bike {

    int a;

    Bike() {
        System.out.println("Inside Bike Constructor: " + a + "\n");
    }

    abstract void run(); // abstract method ! (0-100%)

    void display() {
        System.out.println("This is display method!");
    }
}

class Honda extends Bike {

    @Override
    void run() {

    }

}

public class P09_Task01_AbstractAndFinalClassInJava {

    public static void main(String[] args) {
    	
        Bike obj = new Honda();
        // obj.run();
        obj.display();

        // can not be instantiated
        // Bike obj2 = new Bike();

    }

}

// Final class
final class Super {

    public int data = 38;

    void display() {
        System.out.println(data);
    }
}

/*
 * public class Sub extends Super{
 * 
 * 	void display() {
 * 		display();
 * 	}
 * }
 */