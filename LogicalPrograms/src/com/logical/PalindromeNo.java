package com.logical;

import java.util.Scanner;

public class PalindromeNo {
	public static void main(String[] args) {
		int n, rev=0, rem, temp;
		System.out.println("Enter any number");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		temp=n;
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev) {
			System.out.println("is a Palindrome no.");
		}else {
			System.out.println("is not a Palindrome no.");
		}
	}
	}

