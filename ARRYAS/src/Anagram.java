import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input1 = new String();
		String input2 = new String();
		input1 = s.nextLine();
		input2= s.nextLine();
		//String s1 = new String();
		AngaramApp A1= new AngaramApp();
	    System.out.println(A1.fun(input1 , input2));
		
		
		

	}

}
