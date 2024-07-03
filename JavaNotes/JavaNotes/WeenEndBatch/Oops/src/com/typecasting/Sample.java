package com.typecasting;
//How to overcome classCastException
class Fruit {
	int id;
}
class Apple extends Fruit {
	int aid;
}
class Mango extends Fruit {
	int mid;
}
public class Sample {
	public static void main(String[] args) {
		Fruit f = new Apple();
		// downcating with insstanceOf operator
		if (f instanceof Mango) {
			Mango g = (Mango) f;
		} else {
			System.out.println("No Instance Found");
		}
	}
}
