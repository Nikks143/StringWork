package Home.Work;
/*
 * 9) Write a program to check whether a given string starts with the contents of another string.
 */
public class Que_9 {

	public static void main(String[] args) 
	{
		String s1 = "hefshine";
		String s2  = "hef";
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		int cnt=0;
		for(int i = 0;i<c1.length;i++)
		{
			if(c1[i] == c2[i])
			{
				cnt++;
				break;
			}
		}
		if(cnt  != c2.length)
			System.out.println("s1 starts with s2");
		else
			System.out.println("not ");

	}

}
