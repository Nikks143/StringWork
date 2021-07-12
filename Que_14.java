package Home.Work;
//14) Write a program to test if a given string contains only digits
public class Que_14 
{
	public static void main(String[] args) 
	{
		String s = "Nikhil127";
		char c[] = s.toCharArray();
		int cnt  = 0;
		for(int i = 0;i<c.length;i++)
		{
			if(c[i] > '0' && c[i] < '9')
				cnt++;
		}
		if(cnt > 1)
			System.out.println("Sting contain digit");
		else
			System.out.println("no digit ");

	}

}
