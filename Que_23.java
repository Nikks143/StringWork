package Home.Work;

//23) Write a program to trim any leading or trailing whitespace from a given string.
public class Que_23 
{
	public static void main(String[] args) 
	{
		String s1 = "  abc    xyz  ";
		String s2 ="";
		char c1[] = s1.toCharArray();
		int cnt = 0;
		for(int i = 0;i<c1.length;i++)
		{
			if(c1[i] == ' ')
				cnt++;
			else
			{
				cnt = 0;
				s2 = s2+c1[i];
			}
			if(cnt == 1 && i != 0)
				s2 = s2+c1[i];
				
		}
		s1= "";
		char c2[] = s2.toCharArray();
		for(int j = 0;j<c2.length;j++)
		{
			if(c2[j] == ' ' && j==c2.length-1)
				continue;
			else
				s1 = s1+c2[j];
		}
		System.out.println(s1+"\n"+s1.length());
		
	}

}
