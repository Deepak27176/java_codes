package com.datastructurespractice;
import java.util.*;
public class Array {
	Scanner s = new Scanner(System.in);
private int arr[];
public Array(int n)
{
	arr = new int[n];
	
} 

public void insert()
{
	System.out.println("enter position ");
	int pos = s.nextInt();
	System.out.println("enter value");
	int elem = s.nextInt();
			arr[pos]=elem;
}
public void delete()
{
	System.out.println("enter position to delete");
	int pos = s.nextInt();
	arr[pos]=0;
}
public void display()
{
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
System.out.println();
}
}
