package Home.Work;
/*
 * 33) Write a program to sort numbers in a String. Display the result as a String.
E.g. if number in String is “43521” result is: “12345”. (April Monthly)
 */
public class Que_33 {

	public static void main(String[] args) 
	{
		System.out.println("Original String ");
		String s = "43521";
		System.out.println(s);
		
		char c[] = s.toCharArray();
		for(int i = 0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i] > c[j])
				{
					char t = c[j];
					c[j] = c[i];
					c[i] = t;
				}
			}
		}
		System.out.println("Output : ");
		for(char x:c)
			System.out.print(x);
		

	}

}
