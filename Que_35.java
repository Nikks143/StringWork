package Home.Work;
//35) Write a program to delete all extra spaces in string.
public class Que_35 
{
	public static void main(String[] args) 
	{
//		String s = "(\"hellow world\")";
//		char c[] = s.toCharArray();
//		
//		for(int i = 0;i<c.length;i++)
//		{
//			if(c[i] >=65 && c[i] <= 122)
//			{}
//			else
//				System.out.print(c[i]);
//		}
		
		String s1 = "  abc   xyz  ";
		char c1[] = s1.toCharArray();
		String s2 = "";
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
			if(cnt == 1 && i != 0 )
				s2 = s2+c1[i];
		}
		s1 = "";
		char c2[] = s2.toCharArray();
		for(int j = 0;j<c2.length;j++)
		{
			if(c2[j] == ' ' && j == c2.length-1)
				continue;
			else
				s1 = s1 + c2[j];
		}
		System.out.println(s1);
		System.out.println(s1.length());
		

	}

}
