package Home.Work;
//19) Write a program to find the maximum occurring character in a string.
public class Que_19 
{
	public static void main(String[] args) 
	{
		String s = "grass is greener on the other side";
		int arr[] = new int[s.length()];
		char maxchar = s.charAt(0);
		char minchar = s.charAt(0);
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			arr[i] = 1;
			for(int j = i+1;j<c.length;j++)
			{
				if(c[i] == c[j] && c[i] != ' ' && c[i] != '0' )
				{
					arr[i]++;
					c[j] = '0';
				}
			}
		}
		int max,min;
		min = max = arr[0];
		
		for(int i = 0;i<arr.length;i++)
		{
			if(min>arr[i] && arr[i] != '0')
			{
				min = arr[i];
				minchar = c[i];
			}
			if(max < arr[i])
			{
				max = arr[i];
				maxchar = c[i];			
			}
		}
		System.out.println("max Occuring "+maxchar);
		System.out.println("min Occuring "+minchar);

	}

}
