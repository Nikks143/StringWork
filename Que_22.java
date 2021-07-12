package Home.Work;

public class Que_22
{
	public static void main(String[] args) 
	{
	    String s="aaabbbbddeeeee";//a=3	b=4	d=2	e=5
	    char a='0';
	    a=maxChar(a, s);
        System.out.println(maxChar(a, s));
	}
	private static char maxChar(char a, String s) 
	{
		char c[]=s.toCharArray();
		int cnt=1;
		int max=0;
		int index=0;
		for (int i = 0; i < c.length; i++)
		{    cnt=1;
		    
			if(c[i]!='0' && c[i]!=a)
			{ 
				for (int j = i+1; j < c.length; j++) 
				{

					if(c[i]==c[j])
					{
						cnt++;
						c[j]='0';
					}
				}
				if( max<cnt )
				{
					max=cnt;
					index = i;
				}
			}
		}
		a=c[index];		
		return a;

	}

}
