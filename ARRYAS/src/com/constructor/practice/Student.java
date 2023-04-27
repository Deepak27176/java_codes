package com.constructor.practice;

public class Student {
private int id;
private String name;
private int age;
public Student(int id , String name, int age)
{ 
	 this();
	this.id=id;
	this.name=name;
	this.age=age;
}
public Student(int id ,  int age)
{ 
	 this(123,"raju",11);
	this.id=id;
	name="omkar";
	this.age=age;
}
public Student()
{
	
}
public int getid()
{
	return id;
	
}
public String getname()
{
	return name;
}
public int getage()
{
	return age;
}
}
