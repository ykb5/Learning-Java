package Unit_02;//Inside this package we can create any number of classes

/*
 	- Package in java can be categorized in two forms
 	- built-in package {lang, awt, javax, swing, net, io, util, sql}
 	- User definded package 

 	- packages are named in reverse order of domain names
 	- Unit01.javaproject.com -> "com.javaproject.unit01"
 	
	- import java.util.vector; //import the vector class from util package
	- import java.util.*; //import all the classes from util package
 */

import static java.lang.System.*;

import Unit_01.SampleClass1;

import static java.lang.Math.*;

public class P11_Task02_ImportingAndPackagesInJava {

	public static void main(String[] args) {
		
		out.println("Welcome To Package:)");
		
		out.println(sqrt(4));
		System.out.println(pow(2,2));
		System.out.println(abs(6.3));
		
		SampleClass1 obj = new SampleClass1();
		System.out.println(obj.a);
		
	}
}