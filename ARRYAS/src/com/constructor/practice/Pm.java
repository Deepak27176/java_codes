package com.constructor.practice;

public class Pm {
static Pm p=null;
private Pm()
{
	
}
public static Pm getobj()//FACTORY METHOD BECAUSE PRODUCTION OF OBJECT TAKES PLACE
{  
	if(p==null)
	{p=new Pm();
	return p;}
	else 
	{
		return p;
	}
	
}
}
