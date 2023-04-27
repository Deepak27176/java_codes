import java.util.*;
public class jagged_array {

	public static void main(String[] args) {
	System.out.println("right");
	Scanner s=new Scanner(System.in);
	int a[][]= new int[4][];
	int n;
	for(int i=0;i<a.length;i++)
	{
		 n=s. nextInt();
		 a[i] = new int[n];
	} 
	 for(int i=0;i<a.length;i++)
		{     
			for(int j=0;j<a[i].length;j++){
	System.out.println( "enter balance of customer"+(j+1)+"from the bank"+(i+1));
	a[i][j]= s.nextInt();}}
		System.out.println("array elements are");
		 for(int i=0;i<a.length;i++)
			{     
				for(int j=0;j<a[i].length;j++){
		System.out.print(a[i][j]+"       ");
		
		}System.out.println();
				}
	}

}
