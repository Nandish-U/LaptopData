package com.ty.weekend;

public class StaticInitializer 
{
	static
	{
		//set of instructions
		System.out.println("Static block");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main has been executed");
	}
}
