package com.oop.packges;
//Access within same class
public class Demo {
	public static int k;
	public int a;
	protected int b;
	int c;
	private int d;

	public void m1() {
		System.out.println("Public method");
	}
	protected void m2() {
		System.out.println("Protected method");
	}
	void m3() {
		System.out.println("Default method");
	}
	private void m4() {
		System.out.println("Private method");
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println(d.d);
		d.m1();
		d.m2();
		d.m3();
		d.m4();
	}
}
