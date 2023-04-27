package com.datastructurespractice;
import java.util.*;
public class ArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the array size");
int n =s.nextInt();
Array A= new Array(n);
while(true)
{   
	System.out.println("enter 1 to insert");
	System.out.println("Enter 2 to delete");
	System.out.println("Enter 3 to Display");
	System.out.println("Enter any other number to exit");
	System.out.println("enter your choice");
	int choice = s.nextInt();
	switch(choice)
	{
	case 1:
	{
		A.insert();
		break;
	}
	case 2:
	{
		A.delete();
		break;
	}
	case 3:
	{
		A.display();
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
