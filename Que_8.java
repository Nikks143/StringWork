package Home.Work;

import java.util.Scanner;

//8) Write a program to replace all the 'd' characters with 'f' characters.
public class Que_8 
{
	public static void main(String[] args) 
	{
		String s = "dmldcl";
		
		char c[] = s.toCharArray();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a char ");
		char ch = sc.next().charAt(0);
		
		for(int i = 0;i<c.length;i++)
		{
			if(c[i] == 'd')
				c[i] = ch;
		}
		for(char x:c)
			System.out.print(x);
	}

}
