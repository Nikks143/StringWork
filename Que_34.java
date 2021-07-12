package Home.Work;

public class Que_34 
{
	public static void main(String[] args) 
	{
		String s = "Enjoy every movement in life";
		String s1[] = s.split(" ");
		
		for(int i = 0;i<s1.length;i++)
		{
			for(int j = i+1;j<s1.length;j++)
			{
				if(s1[i].length() > s1[j].length())
				{
					String t = s1[j];
					s1[j] = s1[i];
					s1[i] = t;
				}
			}
		}
		for(int i = 0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		System.out.println("Small word : "+s1[0]);
		System.out.println("larg word : "+s1[s1.length-1]);
		
	}
}
