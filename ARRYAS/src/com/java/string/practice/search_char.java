package com.java.string.practice;
import java.util.*;
public class search_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter string");
		String str= s.nextLine();
		System.out.println("enter character to search");
		String ch =s.next();
		Searching s1= new Searching();
		boolean res=s1.search(str,ch);
		if(res==true)
		{
			System.out.println("string has given character");
		}
		else
		{
			System.out.println("string doesnt has given character");
		}

	}

}
