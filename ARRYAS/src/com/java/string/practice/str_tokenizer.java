package com.java.string.practice;
import java.util.*;
public class str_tokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st= new StringTokenizer("kodnest technologies pvt limited"," ");
		while(st.hasMoreTokens()==true)
		{
			System.out.println(st.nextToken());
		}

	}

}
