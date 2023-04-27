package com.java.string.practice;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("enter the string");
String str = s.nextLine();
char ch[]=str.toCharArray();
char ch2[] = new char[ch.length];
for(int i=0;i<ch.length;i++)
{
	if(ch[i]==' ')
	{
		ch2[i]=ch[i];
	}
}  int j= ch.length-1;
for(int i=0;i<(ch.length);i++)
{  
	if(ch[i]!=' '&&ch2[j]!=' ')
	{
	
	ch2[j]=ch[i];   
	
}          j--;
	}

str=new String(ch2);
System.out.println(str);
	}

}
