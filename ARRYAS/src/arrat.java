import java.util.*;
public class arrat{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[][]=new int[3][4];
		
		
			 for(int i=0;i<arr.length;i++)
		{     
			for(int j=0;j<arr[i].length;j++){
	System.out.println( "enter balance of customer"+(j+1)+"from the bank"+(i+1));
	arr[i][j]= scan.nextInt();}}
		System.out.println("array elements are");
		 for(int i=0;i<arr.length;i++)
			{     
				for(int j=0;j<arr[i].length;j++){
		System.out.print(arr[i][j]+"       ");
		
		}System.out.println();
				}
		
			
		

	

	}

}
