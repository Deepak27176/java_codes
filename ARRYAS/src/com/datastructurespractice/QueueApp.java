package com.datastructurespractice;
import java.util.*;
public class QueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array");
int n = s.nextInt();
Queue Q=new Queue(n);
while(true)
{
	System.out.println("Enter 1 to---------------->INSERT");
	System.out.println("Enter 2 to---------------->DELETE");
	System.out.println("Enter 3 to------------------>DISPLAY");
	System.out.println("Enter any other number to exit");
	System.out.println("enter your choice:");
	int ch = s.nextInt();
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
	default : System.exit(0);
	}
}
	}

}
