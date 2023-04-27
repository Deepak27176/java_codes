package com.java.string.practice;
import java.util.*;
public class replace_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter strings");
		String st = s.nextLine();
		String str = s.nextLine();
		System.out.println(st);
		System.out.println(str);
		String st1=str.replaceAll("hello", "hai");
		String st2=st.replace('r','a');
		System.out.println(st1);
		System.out.println(st2);
		

	}

}
