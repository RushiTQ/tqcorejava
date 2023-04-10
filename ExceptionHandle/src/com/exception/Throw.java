package com.exception;

import java.util.Scanner;

public class Throw {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter any number");
	 int num = scan.nextInt();
	 
	 while(num>0) {
		 if((num%10!=0) && (num%10!=1)) {
			 throw new ArithmeticException("Number is not Binary");
		 }
		 num=num/10;
		
	 }
			 System.out.println("The number is Binary");
		 
	 
}
}
