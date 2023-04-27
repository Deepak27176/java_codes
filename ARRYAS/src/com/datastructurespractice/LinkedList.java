package com.datastructurespractice;
import java.util.*;
public class LinkedList {
private Scanner s= new Scanner(System.in);
class Node
{
	private int data;
	private Node link;
}
Node first=null;
public void insertRear()
{
	System.out.println("enter element to insert");
	int elem = s.nextInt();
	Node newnode = new Node();
	newnode.data=elem;
	newnode.link=null;
	if(first==null)
	{
		first=newnode;
	}
	else
	{
		Node temp = first;
		while(temp.link!=null)
		{
			temp=temp.link;
		}
		temp.link=newnode;
	}
}
public void deleteRear()
{
	if(first==null)
	{
		System.out.println("Linkedlist is empty");
		
	}
	else if(first.link==null)
	{
		System.out.println("deleted element is:"+first.data);
		first=null;
	}
	else 
	{ 
		Node temp = first;
		while(temp.link.link!=null)
		{
			temp= temp.link;
		}
		System.out.println("Deleted element is:"+temp.link.data);
		temp.link=null;
	}
}
public void insertFront()
{
System.out.println("enter element to insert");
int elem = s.nextInt();
Node newnode = new Node();
newnode.data=elem;
newnode.link=null;
if(first==null)
{
	first=newnode;
}
else
{
	newnode.link=first;
	first=newnode;
}
	
}
public void deleteFront()
{
	if(first==null)
	{
		System.out.println("Linkedlist is empty");
		
	}
	else if(first.link==null)
	{
		System.out.println("deleted element is:"+first.data);
		first=null;
	}
	else
	{
		System.out.println("Deleted element is:"+first.data);
		first=first.link;
	}
	
}
public void display()
{
	if(first==null)
	{
		System.out.println("Nothing to display------->>>>>>>>>>>>>>>");
	}
	else if(first.link==null)
	{
		System.out.println(first.data);
	}
	else
	{
		Node temp = first;
		while(temp!=null)
			{
		System.out.print(temp.data+"  ");
		temp=temp.link;
	}}
	System.out.println();
}
}
