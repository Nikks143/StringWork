package Home.Work;

public class Que_2 {

	public static void main(String[] args) 
	{
		String s = "hello";
		String s1 = "llo";
		int cnt=0;
		char c[] = s.toCharArray();
		char c1[] = s1.toCharArray();
		
		for(int i = c.length-1;i>0;i--)
		{
			for(int j = c1.length-1;j>0;j--)
			{
				if(c[i] == c1[j])
					cnt++;
			}
		}
		if(cnt == c1.length)
			System.out.println("given String ends with another String ");
		else
			System.out.println("not Ends with another string ");

	}

}
