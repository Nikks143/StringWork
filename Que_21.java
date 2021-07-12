package Home.Work;
import java.util.Scanner;
// 21) Write a program to find Length of the longest substring without repeating characters.
public class Que_21 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.next();
		char c[] = s.toCharArray();
		int si = 0;
		int ei = 0;
		int max = 0;
		for(int i = 0;i < c.length;i++)
		{
			for(int j = i+1;j < c.length;j++)
			{
				boolean flag = false;
				for(int k = i;k < j;k++)
				{
					if(c[k] == c[j] || j==c.length-1)
					{
						flag = true;
					}
				}
				if(flag == true)
				{
					if(max<(j-i))
					{
						max=(j-i);
						si = i;
						ei = j-1;
					}
					break;
				}
			}
		}
		System.out.println(max);
		for(int i =si;i<=ei;i++)
			System.out.print(c[i]);
	}

}
