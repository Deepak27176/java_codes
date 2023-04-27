package com.string.bouble_Sort;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter size");
int n = s.nextInt();
int arr[]= new int[n];
System.out.println("enter elements");
for(int i=0;i<arr.length;i++)
{
	arr[i]=s.nextInt();
	}
System.out.println("Before swap");
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+"  ");
	} 
System.out.println();
          sort a =new sort();
          a.Bubble(arr);
System.out.println("After swap");
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+"  ");
	}

}}
