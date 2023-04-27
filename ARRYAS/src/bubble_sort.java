import java.util.*;
public class bubble_sort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		int n = s.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Before sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		} 
		System.out.println();
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}

	}

}
