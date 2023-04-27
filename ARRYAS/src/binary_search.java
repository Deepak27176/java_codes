import java.util.*;
public class binary_search {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size ");
		int n=s.nextInt();
		int a[]= new int[n];
		int low ,high,key;
		System.out.println("enter array elements");
		for(int i=0;i<a.length;i++){
			a[i]=s.nextInt();
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
		System.out.println("enter key to search");
		key=s.nextInt();
		low=0;
		high = a.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==a[mid])
			{
				System.out.println("key found at index:"+mid);
				System.exit(0);
			}
			else if(key>a[mid])
			{
				low=mid+1;
				high=high;
			}
			else if(key<a[mid])
			{
				high=mid-1;
				low =low;
			}
	}
System.out.println("key not found");
}
}