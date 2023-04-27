package com.java.string.practice;
import java.util.*;
public class methods_in_strings {

	public static void main(String[] args) {
		// important methods in strings
		Scanner s =new Scanner(System.in);
		System.out.println("enter the string");

		String str = s.nextLine();
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.contains("tech"));
		System.out.println(str.indexOf('t'));
		System.out.println(str.charAt(8));
		System.out.println(str.substring(7));

		System.out.println(str.substring(5, 11));



	}

}
