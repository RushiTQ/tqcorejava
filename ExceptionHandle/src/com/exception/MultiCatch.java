package com.exception;

import java.text.NumberFormat;

public class MultiCatch {
  	int x=10;
	public static void main(String[] args) {
		try {
			int x=10/0;
		}
	    catch(NumberFormatException nu ) {
			System.out.println(1);
		}
		catch(ArithmeticException ar) {
		System.out.println(2);
		}
		
		catch(Exception ex){
			System.out.println(3);
		}
	}
	
}
