package com.datastructurespractice;
import java.util.*;
public class LinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
LinkedList LL = new LinkedList();
while(true)
{
	System.out.println("Press 1 to InsertRear---------->>>>>");
	System.out.println("Press 2 to DeleteRear---------->>>>>");
	System.out.println("Press 3 toInsertfront----------------->>>>>>>");
	System.out.println("Press4 to delete front------------>>>>>>>>>>");
	System.out.println("Press 5 to display------------------->>>>>>>>>");
	System.out.println("press other key to exit");
	int ch = s.nextInt();
	switch(ch)
	{
	case 1:
	{
		LL.insertRear();
		break;
	}
	case 2:
	{
		LL.deleteRear();
		break;
	}
	case 3:
	{
		LL.insertFront();
		break;
	}
	case 4:
	{
		LL.deleteFront();
		break;
	}
	case 5:
	{
		LL.display();
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
