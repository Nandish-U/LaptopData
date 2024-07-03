package com.ty.weekend;
import com.oop.packges.Demo;
//different class and different package..
public class Driver {
	public static void main(String[] args) {
		System.out.println(Demo.k);
		Demo d = new Demo();
		System.out.println(d.a);//public 
		System.out.println(d.b);// CTE protected inhertitance
		System.out.println(d.c);// CTE 
		System.out.println(d.d);// CTE
		d.m1();
		d.m2();// CTE
		d.m3();// CTE
		d.m4();// CTE
		// using fully qualified class name
//		 d = new Demo();
//		System.out.println(d.a);
	}
}
/*
 * keyword called as import full qualified class Name contains
 *  package name and className
 * 
 * where to write we have to write import statement above the class...
 */
