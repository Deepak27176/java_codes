package com.java.string.practice;
import java.util.*;
public class Searching {
	boolean search(String s1, String ch)
	{    
	 	
		char arr[]=s1.toCharArray();
		char arr1[]=ch.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr1[0]||arr[i]==arr1[0]+32||arr[i]==arr1[0]-32)
			{
				return true;
			}
		}

	
	return false;
	}

}
