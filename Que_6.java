package Home.Work;
//6) Write a program to get the last index of a string within a string.
public class Que_6
{
	public static void main(String[] args) 
	{
		String s1 = "hfshine";
		String s2 = "ne";
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		for(int i=0;i<c1.length;i++)
		{
			for(int j =0;j<c2.length;j++)
			{
				if(c1[i] == c2[j])
				{
					System.out.println("last index of "+i);
					break;
				}
					
			}
		}
	}

}
