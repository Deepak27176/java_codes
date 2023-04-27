package com.practice.stativariables;

public class BornAppitite {
	static void bornAppetite(long bill[],int k, long becharged )
	{
		long sum1=0;
		for(int i=0;i<bill.length;i++)
		{
			if(i!=k)
			{
				sum1=sum1+bill[i];
			}
		}
		sum1 = sum1/2;
		if(becharged==sum1)
		{
			System.out.println("Born appetite");
		}
		else
		{
			System.out.println(becharged-sum1);
		}
	}

}
