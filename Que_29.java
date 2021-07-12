package Home.Work;

public class Que_29 {

	public static void main(String[] args)
	{
		String a[] = {"imfine","fine","i","am"};
		
		for(int i = 1;i<a.length;i++)
		{
			String temp = a[i];
			int j = i-1;
			while(j>=0 && temp.length() < a[j].length())
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
		
		for(String x:a)
			System.out.print(x+" ");
	}

}
