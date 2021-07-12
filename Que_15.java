package Home.Work;

public class Que_15 
{
	public static void main(String[] args) 
	{
		System.out.println("----original String ----");
		String s = "hefshine";
		System.out.println(s);
		char c[] = s.toCharArray();
		String res = "";
		int cnt=0;
		for(int i = 0;i<c.length;i++)
		{
			cnt++;
			res = res + c[i];
			if(cnt%3 == 0)
			{
				i = i+2;
			}
		}
		System.out.println("Output : "+res);
	}

}
