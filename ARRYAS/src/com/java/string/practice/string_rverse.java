package com.java.string.practice;
import java.util.*;
public class string_rverse {

	public static void main(String[] args) {
		//compare to method
		Scanner s=new Scanner(System.in);
		System.out.println("enter string1 to compare");
		String s1=s.nextLine();
		System.out.println("enter string2 to compare");
		String s2=s.nextLine();
if(s1.compareTo(s2)>0)
{
	System.out.println("s1 is greater");
}
else if(s1.compareTo(s2)<0)
{
	System.out.println("s2 is greater");
}
else
{
	System.out.println("strings are equal");
}


	}

}
