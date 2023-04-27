package com.java.string.practice;

public class StringEx {

	String subString(String str  ,int index)
	{
		char arr1[]= str.toCharArray();
		char arr2[]=new char[arr1.length-index];
		int j=0;
		for(int i=index;i<arr1.length;i++)
		{
			arr2[j]=arr1[i];
			j++;
			
		}
		str = new String(arr2);
		return str;
		
		
	}
	String subString(String str  ,int startindex, int endindex)
	{
		char arr1[]= str.toCharArray();
		char arr2[]=new char[endindex-startindex+1];
		int j=0;
		for(int i=startindex;i<=endindex;i++)
		{
			arr2[j]=arr1[i];
			j++;
			
		}
		str = new String(arr2);
		return str;
		
		
	}
}
