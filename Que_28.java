package Home.Work;

//28) Write a program to delete all extra blank spaces in a string by the user.
public class Que_28 
{
	public static void main(String[] args) 
	{
		String s1 = "  abc     xyz  ";
		System.out.println(s1);
		char c1[] = s1.toCharArray();
		String s2 = "";
		int cnt = 0;
		
		for(int  i =0;i<c1.length;i++)
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
		s1 = "";
		char c2[] = s2.toCharArray();
		for(int j=0;j<c2.length;j++)
		{
			if(c2[j] == ' ' && j == c2.length-1)
				continue;
			else
				s1 = s1+c2[j];
		}
		System.out.println(s1.length());
		System.out.println(s1);

	}

}
