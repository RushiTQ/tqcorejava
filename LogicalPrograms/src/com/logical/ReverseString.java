package com.logical;
import java.lang.*;
import java.io.*;
import java.util.*;
public class ReverseString {
	
	    public static void main(String[] args)
	    {
	        String input = "I am learning java";
	        char[] temp = input.toCharArray();
	        int j = 0;
	        j = temp.length - 1;
	  
	        for (int i = 0; i < j; i++, j--) {
	            
	            char latest = temp[i];
	            temp[i] = temp[j];
	            temp[j] = latest;
	        }
	  
	        for (char c : temp)
	            System.out.print(c);
	        System.out.println();
	    }
	}

