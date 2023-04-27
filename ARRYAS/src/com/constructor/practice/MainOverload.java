package com.constructor.practice;

public class MainOverload {
	void main()
	{
		System.out.println("hello");
	}
public void main(int i)
{
	System.out.println(i);
}
public static void main(int args[])
{
	for(int i=0;i<args.length;i++)
	{
		System.out.print(args[i]+"  ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hai hai");
MainOverload m1=new MainOverload();
int arr[]={1,2,3,4,5};
m1.main();
m1.main(10);
m1.main(arr);

	}

}
