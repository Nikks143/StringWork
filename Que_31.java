package Home.Work;

import java.util.Arrays;

public class Que_31 
{
	public static void main(String[] args) 
	{
		System.out.println("original String : ");
		String s= "abcDXYZ";
		System.out.println(s);
		char c[] = s.toCharArray();
	
		for(int i = 0;i<c.length;i++)
		{
			if(c[i] >= 'a' && c[i] <= 'z')
				c[i] = (char) (187 - c[i]);
			else
				c[i] = (char) (155 - c[i]);
		}
		System.out.println("Ciper text : ");
		for(char x:c)
			System.out.print(x);

	}

}
