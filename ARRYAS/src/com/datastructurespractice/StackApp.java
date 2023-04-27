package com.datastructurespractice;
import java.util.*;
public class StackApp {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter size of stack");
	int n =s.nextInt();
	Stack stack =new Stack(n);
	while(true)
	{   
		System.out.println("enter 1 to PUSH:");
		System.out.println("Enter 2 to Pop");
		System.out.println("Enter 3 to Dispaly");
		System.out.println("Enter any other number to exit");
		System.out.println("enter your choice");
		int choice = s.nextInt();
		switch(choice)
		{
		case 1:
		{
			stack.push();
			break;
		}
		case 2:
		{
			stack.pop();
			break;
		}
		case 3:
		{
			stack.display();
			break;
		}
		default :
		{
			System.exit(0);
		}
		}
	}

	}

}
