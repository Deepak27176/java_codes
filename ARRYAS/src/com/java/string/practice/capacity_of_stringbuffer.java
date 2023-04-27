package com.java.string.practice;
import java.util.*;
public class capacity_of_stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s =new StringBuffer();
		System.out.println(s.capacity());
		s.append("Virat Kohli is a batsman");
		System.out.println(s.capacity());
		s.append("he plays for india");
		System.out.println(s.capacity());
	}

}
