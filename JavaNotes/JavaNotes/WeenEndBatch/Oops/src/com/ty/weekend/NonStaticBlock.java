package com.ty.weekend;

public class NonStaticBlock 
{
	
	NonStaticBlock()
	{
		System.out.println("Constructor");
	}
	{
		System.out.println("Welcome....!");
	}
	public static void main(String[] args) 
	{
		NonStaticBlock m = new  NonStaticBlock();
	}
}
