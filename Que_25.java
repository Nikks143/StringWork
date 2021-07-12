package Home.Work;
// 25) Write a program to get lowest frequency of a character in a string.
public class Que_25 
{
	public static void main(String[] args) 
	{
		String s =  "fmfmmnaaaaabbbccaccddddd";
		char c[] = s.toCharArray();
		int a[] = new int[c.length];
		char minchar = s.charAt(0);
		
		for(int i = 0;i<c.length;i++)
		{
			int cnt  = 1;
			for(int j = i+1;j<c.length;j++)
			{
				if(c[i] == c[j] && c[i] != ' ' && c[i] != '0')
				{
					cnt++;
					c[j] = '0';
				}
			}
			if(c[i] != '0')
				System.out.println(c[i]+" "+cnt);
		}
		int min=9999;
		for(int i = 0;i<a.length;i++)
		{
			if(min > a[i] )
			{
				min = a[i];
				minchar = c[i];
			}
		}
		System.out.println("lowest Frequent char is  :  "+minchar);
	}

}
