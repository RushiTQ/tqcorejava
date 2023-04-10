package com.varags;

public class VaragsRules {

	public static void test(int...a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		VaragsRules.test(1,2,3,4,5,6);
	}
}