package com.java.practice.encapsulation;
import java.util.*;
public class Sort {
static  public void sorting(EmployeeArray[] arr)
{
	 for(int i=0;i<arr.length;i++)
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
		}
}
}
