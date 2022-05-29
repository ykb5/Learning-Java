package Unit_03;

import java.util.Scanner;

class C1 {
	void show1() {
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println(a);
		System.out.println("Done with show1()!");
		obj.close();
	}
}

class C2 {
	void show2() {
		for(int i = 0; i<10; i++) {
			System.out.println(i + "- Hey_2!");
		}
	}
}

public class P16_MultiThreadingInJava {
	public static void main(String [] args) {
		
		/*
		Scanner Scan = new Scanner(System.in);
		ABC obj = new ABC();
		
		obj.threadConcept();
		obj.threadSynchronization();
		obj.interThreadCommunication();
		obj.ProducerConsumerProblems();
		obj.Wait_And_Notify();
		 */
		
		/*
		 * Main thread will execute C1.show method and the C2.show
		 */
		
		C1 obj1 = new C1();
		obj1.show1();
		
		System.out.println("\n");
		C2 obj2 = new C2();
		obj2.show2();
		
//		Thread t1 = new Thread(new T1(), "T1");
//		Thread t2 = new Thread(new T2(), "T2");
//		Thread t3 = new Thread(new T3(), "T3");
//		
//		t1.start();
//		t2.start();
//		t3.start();
	}

}

class T1 extends Thread {
	@override
	public void run() {
		
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println(a);
		System.out.println("Done with T1!");
		obj.close();
	}
}

class T2 implements Runnable {
	@override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i + "- Hey_2!");
		}
	}
}

class T3 extends Thread {
	@override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println( i + " HEY_3!");
		}
	}
}

/*
class ABC {
	void threadConcept(){}
	void threadSynchronization(){}
	void interThreadCommunication(){}
	void ProducerConsumerProblems(){}
	void Wait_And_Notify(){}
*/