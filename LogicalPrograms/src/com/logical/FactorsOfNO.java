package com.logical;
import java.util.Scanner;

public class FactorsOfNO {
	
    public static void main(String[] args) {
	  
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any Number");
	int num = scan.nextInt();
	
	for(int i=1; i<=num; i++) {
		if(num%i==0) {
			
			System.out.println("Factors of "+num+" is "+i);
			
		}
	}
}
}
