package com.ps.app;
import java.util.*;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@Data
@AllArgsConstructor
public class Account {
	
	
	private String acnumber="dtyuj23i";
	
	
	private String name="akhil";
	
	private String pin="8465";
	
	private double balance=0.0;
	
	
	public void validate() {
		Scanner sc=new Scanner(System.in);
		int noOfAttempts=0;
		while(true) {
			System.out.println("enter the pin to go to main menu ::");
			String pin1=sc.next();
			if(pin1.equals(pin)) {
				menu();
				
			}else {
				System.out.println("Invalid pin...");
				noOfAttempts++;
				if(noOfAttempts==3) {
					System.out.println("your card is bloked ......");
					System.out.println("Please contact branch manager..........");
					break; 
				}
				
			}
		}
	}
	public void menu() {
		Scanner sc1=new Scanner(System.in);
		int ch=0;
		while(ch!=5) {
			System.out.println("press 1 to change pin>>>>>>");
			System.out.println("press 2 to deposit amount>>>>>>");
			System.out.println("press 3 to withdraw amount>>>>>>");
			System.out.println("press 4 to check balance>>>>>>");
			System.out.println("press 5 to exit >>>>>>");
		     ch=sc1.nextInt();
			switch(ch) {
			case 1:createPin();
			break;
			case 2:deposite();
			break;
			case 3:withdraw();
			break;
			case 4:checkBalannce();
			break;
			case 5:System.out.println("Thanks for using our ATM::::::::::");
			break;
			}

		}
	}
	public void createPin() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("please enter new pin to set");
		String newpin=sc1.next();
		System.out.println("new pin set successfully........");
		
		
	}
	public void deposite() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("please enter the amount for deposite!!!!!!");
		double amount=sc1.nextDouble();
		this.balance=this.balance+amount;
		System.out.println(amount+"  deposite done.....");
		menu();
		
	}
	public void withdraw() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("please enter the amount for withdrawl!!!!!!");
		double amount=sc1.nextDouble();
		if(amount>balance) {
			System.out.println("insufficient funds..");
		}
		else {
			this.balance=this.balance-amount;
			System.out.println(amount+"  withdrwal successfully,,..");
		}
		menu();
		
	}
	public void checkBalannce() {
		System.out.println("your account baalance is "+this.balance);
		
	}
	

}
