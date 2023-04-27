package com.java.string.practice;
import java.util.*;
public class intern_method {

	public static void main(String[] args) {
		// to transport string from non const pool to const pool
String s1=new String("omkar");
String s2=s1.intern();
String s3="omkar";
if(s2==s3){
	System.out.println("string is transported");
}
else
{
	System.out.println("string is not transported");

}
	}

}
