package Home.Work;
//3) Write a program to check whether two String objects contain the same data
public class Que_3 
{
	public static void main(String[] args) 
	{
		String s = "abc";
		String s1 = "abc";
		int cnt = 0;
		char c[] = s.toCharArray();
		char c1[] = s1.toCharArray();
		
		for(int i = 0;i<c.length;i++)
		{
			for(int j = 0;j<c1.length;j++)
			{
				if(c[i] == c1[j])
				{
					cnt++;
				}
			}
		}
		if(cnt == c1.length)
			System.out.println("both string are same ");
		else
			System.out.println("both string are diff ");
		

	}

}
