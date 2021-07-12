package Home.Work;

import java.util.Scanner;

public class Que_5 {

	public static void main(String[] args) 
	{
		String s = "abc";
		char c[] = s.toCharArray();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a char u want : ");
		char ch = sc.next().charAt(0);
		
		for(int i = 0;i<c.length;i++)
		{
			if(c[i] == ch)
			{
				System.out.println("index of "+ch+"  is : "+i);
				break;
			}	
		}

	}

}
