package Home.Work;
// 27) Write a program to convert all the characters in a string to lowercase.
public class Que_27 
{
	public static void main(String[] args) 
	{
		String s = "ABCXYZ";
		char c[] = s.toCharArray();
		
		for(int i = 0;i<c.length;i++)
		{
			if(c[i] >= 65 && c[i] <= 91)
			{
				c[i] = (char) (c[i]+32);
			}
		}
		for(char x:c)
			System.out.print(x);

	}

}
