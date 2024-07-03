package com.typecasting;

class A
{
	
}
class B extends A
{
	
}
class C extends A
{
	
}
public class Main 
{
	public static void main(String[] args) 
	{
		Object o  = new A();
		System.out.println(o instanceof Object);
		System.out.println(o instanceof A);
		
		A a = new B();
		System.out.println(a instanceof Object);
		System.out.println(a instanceof A);
		System.out.println(a instanceof C);
	}
}
