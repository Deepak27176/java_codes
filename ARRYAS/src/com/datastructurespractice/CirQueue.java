package com.datastructurespractice;
import java.util.*;
public class CirQueue {
private int cq[];
private int r=-1;
private int f=0;
private int count=0;
private int size;
private Scanner s= new Scanner(System.in);
public CirQueue(int n)
{
	cq = new int[n];
	size=cq.length;
}
public void insert()
{
	if(count==size)
	{
		System.out.println("Queue is full");
	}
	else
	{
		System.out.println("enter element to insert");
		int elem = s.nextInt();
		r =(r+1)%size;
		cq[r]=elem;
		count++;
}
}
public void delete()
{ if(count==0)
{
	System.out.println("Queue is empty");
}
else{
	System.out.println("Deleted element is"+cq[f]);
	f=(f+1)%size;
	count--;
}
}
public void display()
{
	int f1=f;
	for(int i=1;i<=count;i++)
	{
		System.out.println(cq[f1]+"  ");
		f1=(f1+1)%size;
	}
}
}
