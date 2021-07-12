package Home.Work;

import java.util.Scanner;

//13) Write a program to remove a specified character from a given string.
public class Que_13 
{
	public static void main(String[] args) 
	{
		System.out.println( " Original String ");
		String s = "nikhil";
		System.out.println(s);
		char c[] = s.toCharArray();
		String res = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a char to be removed ");
		char ch = sc.next().charAt(0);
		
		for(int i = 0;i<c.length;i++)
		{
			if(c[i] != ch)
				res = res+c[i];
		}
		System.out.println("after removing char "+res);

	}

}
