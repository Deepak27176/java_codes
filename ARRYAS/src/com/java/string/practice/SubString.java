package com.java.string.practice;
import java.util.*;
public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String str = s.nextLine();
		System.out.println("enter index");
		int k = s.nextInt();
		StringEx sub = new StringEx();
		String res1=sub.subString(str, k);
		System.out.println(res1);
		System.out.println("enter from and to indices");
       int ind1=s.nextInt();
       int ind2=s.nextInt();
       String res2=sub.subString(str, ind1,ind2);
       System.out.println(res2);

	}

}
