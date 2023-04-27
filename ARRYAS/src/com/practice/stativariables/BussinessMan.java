package com.practice.stativariables;
import java.util.*;
public class BussinessMan {
private int p;
private int t;
private float si;
static float r;
static
{
	r=2.0f;
}
Scanner s=new Scanner(System.in);
public void takeIp()
{
	System.out.println("enter principle");
	p=s.nextInt();
	System.out.println("enter time");
	t=s.nextInt();
	
}
void calcSi()
{
	si=(p*t*r)/100;
}
void display()
{
	System.out.println("si is:"+si);
}
}
