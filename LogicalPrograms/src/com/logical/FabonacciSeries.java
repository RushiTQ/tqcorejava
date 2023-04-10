package com.logical;

public class FabonacciSeries {
	public static void main(String[] args) {
	      int a=0; int b=1;
		System.out.print(a+" "+b);
		int c;
		for(int i=0; i<=13; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
	}
}
