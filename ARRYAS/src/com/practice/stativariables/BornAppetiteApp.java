
package com.practice.stativariables;
import java.util.*;
public class BornAppetiteApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int k = scan.nextInt();
long bill[]= new long[n];
for(int i=0;i<bill.length;i++)
{
	bill[i]=scan.nextLong();
}
long becharged = scan.nextLong();
BornAppitite.bornAppetite(bill, k, becharged);
	}

}
