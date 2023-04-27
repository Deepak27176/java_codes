
public class AngaramApp {
	public String fun(String input1, String input2 )
	{
		char ch1[]=input1.toCharArray();
		char ch2[]=input2.toCharArray();
		if(ch1.length!=ch2.length)
		{
			return "no";
		}
		else {
		for(int i=0;i<ch1.length-1;i++)
		{
			for(int j=0;j<=ch1.length-1-i;j++)
			{
				if(ch1[j]>ch1[j+1])
				{
				char  temp = ch1[j];
				ch1[j]=ch1[j+1];
				ch1[j+1]= temp;
				}
				
			}}
			for( int i=0;i<ch2.length-1;i++)
			{
				for(int j=0;j<=ch2.length-1-i;j++)
				{
					if(ch2[j]>ch2[j+1])
					{
					char  temp1 = ch2[j];
					ch2[j]=ch2[j+1];
					ch2[j+1]= temp1;
					}
					
				}
		}
			for(int k=0;k<ch1.length;k++)
			{
				if(ch1[k]!=ch2[k])
				{
					return "no";
					
				}
			}
			return "yes";
	}

}}
