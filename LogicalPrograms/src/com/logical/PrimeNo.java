package com.logical;

import java.util.Scanner;

public class PrimeNo {
public static void main(String[] args) {
	int i,m,flag=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter any Number");
	int n= scan.nextInt();
	m=n/2;
	if(n==0 || n==1) {
		System.out.println(n+ " is not a prime Number");
	}
	else {
		for(i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.println(n+" is not a Prime Number");
				flag=1;
				break;
			}
		}
	}
	if(flag==0) {
		System.out.println(n+" is a prime Number");
	}
	}
}

