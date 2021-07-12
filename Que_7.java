package Home.Work;
// Write a program to get the length of a given string.
public class Que_7 {

	public static void main(String[] args) 
	{
		String s = "Nikhil";
		char c[] = s.toCharArray();
		int cnt=0;
		for(int i = 0;i<c.length;i++)
		{
			cnt++;
		}
		System.out.println("langth of string is : "+cnt);

	}

}
