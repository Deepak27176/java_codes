import java.util.*;
public class linear_search {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	System.out.println("enter array size");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter key to search");
		int key =s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				System.out.println("key found at index:"+i);
				System.exit(0);
			}
		}
		System.out.println("key not found");
		
		

	}

}
