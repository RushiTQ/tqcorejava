package com.containment;

import java.util.Scanner;

public class LibraryInput {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	Book b = new Book();
	Author a =new Author();
	
	System.out.println("Enter Book id");
	b.setBid(scan.nextInt());
	
	System.out.println("Enter Book name");
	b.setBname(scan.next());
	
	System.out.println("Enter Book price");
	b.setPrice(scan.nextFloat());
	
	System.out.println("Enter Author id");
	a.setAid(scan.nextInt());
	
	System.out.println("Enter Author name");
	a.setName(scan.next());
	
	System.out.println("Enter Author age");
	a.setAge(scan.nextInt());
	
	b.setAuthor(a);
	
	System.out.println("-------------------");
	System.out.println(b);
	
}
}
