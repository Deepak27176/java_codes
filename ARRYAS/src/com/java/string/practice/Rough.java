package com.java.string.practice;
import java.util.*;
public class Rough {

	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  int A[] = new int[5];
	  int B[] = new int[5];
	  for(int i = 0; i<A.length;i++)
	  {
		  A[i] = s.nextInt();
	  }
	 
	  for(int i = 0; i<A.length;i++)
	  {
		  int count1 = 0;
		  for(int j =1 ; j<=A[i];j++)
		  {     int count = 0;
			  for(int k = 1;k<=j;k++){
				  if(j%k==0)
				  {
					  count += 1;
				  }
			  }
			  if (count == 2)
			  {
				  count1+= 1;
				  
			  }
		  }
		  B[i] = count1;
	  }
	  for(int i = 0; i<A.length;i++)
	  {
		  System.out.print(B[i]+" ");
	  }
		
	}

}
