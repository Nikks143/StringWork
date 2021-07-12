package Home.Work;
//11) Write a program to convert all the characters in a string to lowercase.
public class Que_11
{
	public static void main(String[] args) 
	{
		String s1 = "NIKHIL";
		char c1[] = s1.toCharArray();
		
		for(int i = 0;i<c1.length;i++)
		{
			if(c1[i] >= 65 && c1[i] <= 91)
				c1[i] = (char) (c1[i]+32);
		}
		System.out.println("Converting is lower : ");
		for(char x:c1)
			System.out.print(x);

	}

}
