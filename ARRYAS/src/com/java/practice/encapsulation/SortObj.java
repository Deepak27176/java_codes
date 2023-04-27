package com.java.practice.encapsulation;
import java.util.*;
public class SortObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeArray e1 = new EmployeeArray();
		EmployeeArray e2= new EmployeeArray();
		EmployeeArray e3 = new EmployeeArray();
		EmployeeArray e4 = new EmployeeArray();
		e1.setName("ram");
		e1.setAge(24);
		e1.setId(123);
		e2.setName("raj");
		e2.setAge(43);
		e2.setId(125);
		e3.setName("papa");
		e3.setAge(19);
		e3.setId(453);
		e4.setName("lilly");
		e4.setAge(20);
		e4.setId(234);
		EmployeeArray arr[] = new EmployeeArray[4];
		arr[0]=e1;
		arr[1]=e2;
		arr[2]=e3;
		arr[3]=e4;
		System.out.println("Before swap:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getName()+"  "+arr[i].getAge()+"  "+arr[i].getId()+"  ");
		}
	/*	for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i].getAge()<arr[j].getAge())
				{
					EmployeeArray temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		Sort.sorting(arr);
		System.out.println("After swap:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getName()+"  "+arr[i].getAge()+"  "+arr[i].getId()+"  ");
		}
		
	}

}
