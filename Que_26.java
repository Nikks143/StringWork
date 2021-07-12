package Home.Work;
// 26) Write a program to repeat each of the character twice in a given string.
public class Que_26 
{
	public static void main(String[] args) 
	{
		String s = "abc";
		char c[] = s.toCharArray();
		String res = "";
		for(int i = 0;i<c.length;i++)
		{
			//System.out.println(c[i]);
			res = res + c[i]+c[i];
		}
		System.out.println(res);
	}

}

