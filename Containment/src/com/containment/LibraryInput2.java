package com.containment;

import java.util.Scanner;

public class LibraryInput2 {
	
  static Scanner scan = new Scanner(System.in);

  public  void enterBookDetails(Book b) {
	  Author au =new Author();
	
	  System.out.println("Enter Book id");
	  b.setBid(scan.nextInt());
	
	  System.out.println("Enter Book name");
	  b.setBname(scan.next());
	
	  System.out.println("Enter Book price");
	  b.setPrice(scan.nextFloat());
	  
	  enterAuthorDetails(au);
	  b.setAuthor(au);
  	
  }
   public  void enterAuthorDetails(Author a) {
	   
	    System.out.println("Enter Author id");
		a.setAid(scan.nextInt());
		
		System.out.println("Enter Author name");
		a.setName(scan.next());
		
		System.out.println("Enter Author age");
		a.setAge(scan.nextInt());
   }
   
   public static void main(String[] args) {
	 LibraryInput2 lib = new LibraryInput2();
	 
	 Book b1 = new Book();
	 
	 lib.enterBookDetails(b1);
	 System.out.println(b1);
	 
	 Book b2 = new Book();
	 
	 lib.enterBookDetails(b2);
	 System.out.println(b2); 
	 
	 Author a1 = new Author();
	 lib.enterAuthorDetails(a1);
	 System.out.println(a1);
	 
	 
}

}
