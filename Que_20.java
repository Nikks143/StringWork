package Home.Work;
//20) Write a program to print after removing duplicates from a given string.
public class Que_20 
{
	public static void main(String[] args) 
	{
		String s = "aabbccefghiaabbcdde";
		char c[] = s.toCharArray();
		for(int i = 0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i] == c[j])
				{
					c[j]  = '0';
				}
			}
			if(c[i] != '0')
				System.out.print(c[i]);
		}
		
	}

}
