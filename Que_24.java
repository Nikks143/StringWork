package Home.Work;
//24) Write a program to find frequency of character in a string
public class Que_24 
{
	public static void main(String[] args) 
	{
		String s = "aabbbccccddddd";
		char c[] = s.toCharArray();
		
		int cnt = 0;
		for(int i = 0;i<c.length;i++)
		{
			cnt  = 1;
			for(int j = i+1;j<c.length;j++)
			{
				if(c[i] == c[j])
				{	
					cnt++;
					c[j] = ' ';
				}
			}
			if(c[i] != ' ')
				System.out.println(c[i]+" "+cnt);
		}

	}

}
