package Unit_03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exception & Error
 */

public class P14_ExceptionHandlingInJava {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);

		ABC5 obj = new ABC5();

		obj.basicException();
		obj.handleException();
		obj.multipleCatch();
		obj.inputMismatchException();
		//obj.stackOverFlowError(6);
		obj.indexOutOfBoundException();
		obj.nullPointerException();
		// obj.useOfThrow(18);
		obj.useOfThrows_And_Finally();
		obj.checkedAndUncheckedException();

	}
}

class ABC5 {

	void basicException() {
		try {
			int b = 0;
			int a = 100 / b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done");

	}

	void handleException() {

		try {
			// sensitive code
			int b = 0;
			int a = 100 / b;
			System.out.println(a);
		}

		// child catch block]
		catch (ArithmeticException e) {

			System.out.println("kahddeuggdcbjguyxgxqui");
			System.out.println(e.getMessage());
		}

	}

	void multipleCatch() {

		// in the case of multiple exception our child class will
		// be placed first then our parent class will be placed
		try {
			// sensitive code
			int b = 0;
			int a = 100 / b;
			System.out.println(a);
		}

		// child catch block]
		catch (ArithmeticException e) {

			System.out.println("kahddeuggdcbjguyxgxqui");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("kahddeuggdcbjguyxgxqui");
			System.out.println(e.getMessage());
		}

	}

	void inputMismatchException() {

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter A Number -> ");
			int number = scan.nextInt();
			System.out.println("You Have Entered -> " + number);
			scan.close();
		} catch (InputMismatchException e) {
			System.out.println("Input Mismatch Issue");
		}
		System.out.println("Done");

	}

	void stackOverFlowError(int i) {

		try {
			while (i > 0) {
				i++;
				stackOverFlowError(i);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// Rest of the code
		System.out.println("Done!");

	}

	void indexOutOfBoundException() {

		try {
			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			System.out.println("Something Went Wrong!:(");
		}

		// finally lets you to execute the code after try and catch block regardless of
		// the result
		finally {
			System.out.println("The 'Try and Catch' block is finished");
		}
	}

	void nullPointerException() {

		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

	void useOfThrow(int age) throws Exception {

		if (age > 18) {
			throw new Exception();
		} else {
			System.out.println("You are allowed to Enter:)");
		}

	}

	void useOfThrows_And_Finally() {
		try {
			useOfThrow(18);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void checkedAndUncheckedException() {

	}

}

/*
void checkedAndUncheckedException() {

	*
	 * Unchecked Exception: Run time catching - Here we are dividing by 0 - which
	 * will not be caught at compile time - as there is no mistake but caught at
	 * runtime - because it is mathematically incorrect
	 *
	int x = 0;
	int y = 10;
	int z = y / x;

	System.out.println(z);

	// Checked Exception [Run this code over terminal and check compiler error]
	try {
		useOfThrow(19);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

void manualExceptionThrow() {

	try {

		// Have to use try and Catch here!
		calculateArea(-1);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

}

void calculateArea(int r) throws ManualException {

	if (r < 0) {
		throw new ManualException();
	}

	int area = r * r;
	System.out.println(area);

}

}

@SuppressWarnings("serial")
class ManualException extends Exception {

@Override
public String getMessage() {
	String detailMessage = "Exception Occured!";
	return detailMessage;
}

}
*/