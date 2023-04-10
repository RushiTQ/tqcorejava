package com.logical;

import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String[] args) {
		int n, arm=0, rem, c;
		System.out.println("Enter any number");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		c=n;
		while(n>0) {
			rem= n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm) {
			System.out.println("is a Armstrong no.");
			
		}else {
			System.out.println("is not a Armstromg no.");
		}
	}
}

