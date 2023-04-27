package com.datastructurespractice;
import java.util.*;
public class Queue {
	Scanner s=new Scanner(System.in);
private int q[];
private int size;
private int front=0;
private int rear =-1;
public Queue(int n)
{
	q= new int[n];
	size =q.length;
}
public void insert(){
	if(rear==size-1)
	{
		System.out.println("QUEUE IS FULL---------------------->>>>");
	}
	else
	{
		System.out.println("Enter value to insert:");
		int elem = s.nextInt();
		rear++;
		q[rear]=elem;
	}
}
public void delete()
{
	if(rear==-1||front>rear)
	{
		System.out.println("QUEUE IS EMPTY---------------------->>>>>>>>>>>>>>");
	}
	else
	{
		System.out.println("Deleted element is: "+q[front]);
		front++;
	}
}
public void display()
{
	if(rear==-1||front>rear)
	{
		System.out.println("NOTHING TO DISPLAY---------------->>>>>>>>>>>>>>");
	}
	else
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.print(q[i]+"  ");
		}
		System.out.println();
	}
}
}
