package com.throwkeyword;

import java.util.Scanner;

public class Password {
public static void main(String[] args) throws InvalidPasswordException   {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter any String");
	String s = scan.next();
	
	if(s.length()<7) {
		
		throw new InvalidPasswordException("Password is Incorrect");
		
		
		}else {
		System.out.println("Password is Correct");
	}
}
}
