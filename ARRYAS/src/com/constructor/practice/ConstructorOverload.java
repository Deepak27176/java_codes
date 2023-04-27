package com.constructor.practice;
import java.util.*;
public class ConstructorOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(123,"ram",12);
System.out.println(s1.getid());
System.out.println(s1.getname());
System.out.println(s1.getage());
Student s2= new Student(124,13);
System.out.println(s2.getid());
System.out.println(s2.getname());
System.out.println(s2.getage());
	}

}
