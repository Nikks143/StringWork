package Home.Work;
//16) Write a program to return the sum of the digits present in the given string. If there is no digits the sum return is 0.
public class Que_16 
{
	public static void main(String[] args) 
	{
		String s = "ni313khi21l";
		char c[] = s.toCharArray();
		int sum = 0;
		for(int i = 0;i<c.length;i++)
		{
			if(c[i] >=48  && c[i] <= 58)
				sum += c[i]-48;
		}
		System.out.println("Sum of digit : "+sum);
	}

}
