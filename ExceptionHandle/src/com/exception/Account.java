package com.exception;

import java.util.Scanner;

public class Account {
	private int no;
	private int balance;
	
     Account(){
    	 
     }
     Account(int no, int balance){
    	this.no=no;
    	this.balance= balance;
     }
     
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public static void cashWithdrawl(int amount) {
		if(amount>50000) {
			throw new ArithmeticException("Insufficient Balance");
		}else {
			System.out.println("Amount to be withdrawl");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawal");
		int amt= scan.nextInt();
		cashWithdrawl( amt);
	}
}
