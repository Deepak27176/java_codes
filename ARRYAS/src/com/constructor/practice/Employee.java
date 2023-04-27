package com.constructor.practice;

public class Employee {
	int id;
	String name;
	int salary;
	public Employee(int id,String name,int salary)
	{    
		if(id>0){
		this.id=id;
		}else 
		{
			System.out.println("invalid id");
		}
		this.name=name;
		if(salary>10000){
		this.salary=salary;}
		else
		{
			System.out.println("invalid salary");
		}
	}

	public int getId()
	{
		return id;
	}
public String getname()
{
	return name;
}
public int getsalary()
{
	return salary;
}
}
