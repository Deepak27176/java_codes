import java.util.*;
public class immutable_string {

	public static void main(String[] args) {
		String s1= new String("RAJU");
		String s2=new String("RAJU");
		if(s1==s2)
		{
		System.out.println("reference are equal");
		}
		else
		{
			System.out.println("reference are un equal");

		}
		if(s1.equals(s2))
		{
			System.out.println("strings are equal");
		}
	}

}
