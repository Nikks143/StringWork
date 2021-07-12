package Home.Work;

public class Que_4 {

	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = "Java";
		System.out.println("-----Using method------");
		if(s1.equalsIgnoreCase(s2))
			System.out.println("both String are same ");
		else
			System.out.println("both string are diff");
		
		System.out.println();
		System.out.println("-----with out using method-----");
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		int cnt = 0;
		if(c1.length == c2.length)
		{
			for(int i = 0;i<c2.length;i++)
			{
				if(c1[i] <= 65 && c1[i] >= 91)
					c1[i] = (char) (c1[i] +32);
				else if(c2[i] >= 65 && c2[i] <= 91)
					c2[i] = (char) (c2[i]+32);
				if(c1[i] == c2[i])
					cnt++;
			}
		}
		if(cnt == c2.length)
			System.out.println("both str is same ");
		else
			System.out.println("both str is Diff ");
		
		

	}

}
