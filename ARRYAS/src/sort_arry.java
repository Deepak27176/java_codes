import java.util.*;
public class sort_arry {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter array size");
		int n = s.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
			System.out.println("before sorting");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+"  ");
			} 
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					if(i!=j&&a[i]<a[j])
					{
						int temp =a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("after sorting");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+"  ");
			} 

	}

}
