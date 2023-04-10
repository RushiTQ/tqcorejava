package com.constructor;

public class Chaining {
	
	Chaining(){
		
		System.out.println("It is default constructor");
	}
	Chaining(int x, int y){
		this();
		System.out.println("Constructor have two arguments");
	}
	Chaining(int x, int y, int z){
		this(20,30);
		System.out.println("Constructor have three arguments");
	}
	
	
public static void main(String[] args) {
	Chaining ch = new Chaining(10,20,30);
	
}
}
