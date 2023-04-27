package com.datastructurespractice;
import java.util.*;
public class CirQueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter size of Queue");
int n = s.nextInt();
CirQueue Q=new CirQueue(n);
while(true)
{
	System.out.println("Enter 1 to--------------->>>>>>insert()");
	System.out.println("Enter 2 to----------->>>>>>>>>delete()");
	System.out.println("Enter 3 to-------------->>>>>>>display()");
	System.out.println("Enter any other no to exit");
	System.out.println("Enter your choice");
	int ch =s.nextInt();
	switch(ch)
	{
	case 1:
	{
		Q.insert();
		break;
	}
	case 2:
	{
		Q.delete();
		break;
	}
	case 3:
	{
		Q.display();
		break;
	}
	default: System.exit(0);
	
	}
}
	}

}
