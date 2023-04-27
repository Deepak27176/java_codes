package com.string.bouble_Sort;
import java.util.*;
public class InsetionSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array");
		int n = s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("before sort:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
				InsertionSort sort = new InsertionSort();
				sort.insertionSort(arr);
				
				System.out.println("After sort:");
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i]+"  ");
				}
	}

}
