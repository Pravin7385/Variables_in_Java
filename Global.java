package com.variable;
/*
 Global Variable-->
 		Global Variables it is defined outside the method
 		but inside the class is called as Global variable.
 */
public class Global { // this is class 
	
	int x; // it is variable declaration.
	int y = 10; // it is variable initialization.
	
	public static void main(String[] args) { // this is main method
		
		Global global = new Global(); // this is create object of class
		System.out.println(global.x);
		System.out.println(global.y);
	}
	

}
