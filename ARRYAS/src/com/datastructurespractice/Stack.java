package com.datastructurespractice;
import java.util.*;
public class Stack
{ 
	Scanner s = new Scanner(System.in);
private int arr[];
private int size;
int top=-1;
public Stack (int n)
{
	arr= new int[n];
	size = arr.length-1;
}
public void push()
{
	if(top==size)
	{
		System.out.println("Stack is full");
	}
	else
	{
		System.out.println("enter element to push");
		int elem = s.nextInt();
		top++;
		arr[top]=elem;
	}
}

public void pop()
{
	if(top==-1)
	{
		System.out.println("Stack is empty");
	}
	else
	{
		System.out.println("Poped element is:"+arr[top]);
		top--;
	}
}
public void display()
{
	if(top==-1)
	{
		System.out.println("nothing to dispaly");
	}
	else
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	
}

}
