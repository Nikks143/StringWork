package Home.Work;
// 17) Write a program to count and print all the duplicates in the input string.
public class Que_17 
{
	public static void main(String[] args) 
	{
		String s = "abbcccdddd";
		char c[] = s.toCharArray();
		int cnt = 0;
		for(int i=0;i<c.length;i++)
		{
			cnt= 1;
			for(int j = i+1;j<c.length;j++)
			{
				if(c[i] == c[j])
				{
					cnt++;
					c[j] = ' ';
				}
			}
			if(cnt >= 1 && c[i] != ' ')
				System.out.println(c[i]+" "+cnt);
		}

	}

}
