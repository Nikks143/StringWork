package Home.Work;
// 18) Write a program to reverse every word in a string using methods.
public class Que_18 
{
	public static void main(String[] args) 
	{
		System.out.println("---original String---");
		String s = "Nikhil Gurav ";
		System.out.println(s);
		String s1 = "";
		String s2 = "";
		String res = "";
		char c[] = s.toCharArray();
		
		for(int i = 0;i<c.length;i++)
		{
			if(c[i] != ' ')
				s1 += c[i];
			else
			{
				s1 += " ";
				StringBuffer sb = new StringBuffer(s1);
				s2 = new String(sb.reverse());
				//System.out.println(s2);
				
				char a_s2[] = s2.toCharArray();
				for(int j=0;j<a_s2.length;j++)
				{
					res += a_s2[j];
				}
				s1 = "";
			}
		}
		System.out.print("Reverse every Word : "+res);
	}

}
