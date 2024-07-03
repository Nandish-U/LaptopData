package com.oop.packges;
//same package different class
public class Sample 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println(d.d);//CTE private
		
		d.m1();
		d.m2();
		d.m3();
		d.m4();//CTE
	}
}
