package com.inhertance;


class Demo
{
	//10000 lines of code
	int a;
	public void m1()
	{
		System.out.println("Demo class method");
	}
}
class Sample extends Demo
{
	int b;
	public void test()
	{
		System.out.println("Sample class method");
	}
}
public class Main 
{
	public static void main(String[] args) 
	{
		//with the help of super class ref variabe
			Demo d = new Demo();
			System.out.println(d.a);
			d.m1();
			
		// object of subclass
			Sample s = new Sample();
			System.out.println(s.b);
			System.out.println(s.a);
			s.m1();
			s.test();
	}

}
