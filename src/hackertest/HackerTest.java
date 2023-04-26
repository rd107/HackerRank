package hackertest;

public class HackerTest
{
	public static void main(String[] args) 
	{
		int []arr = {1,2,3,4,5};
		
		int rotation = 4;
		
		int n = arr.length;
		
		int []temparr = new int[n];
		
		int cnt = 0;
		int count = 0;
		
		for(int i=rotation;i<n;i++)
		{
			temparr[cnt]=arr[i];
			cnt++;
		}
		
		count = n-rotation;
		for(int i=0;i<rotation;i++)
		{
			temparr[count]=arr[i];
			count++;
		}
		
		for(int x:temparr)
		{
			System.out.print(x+" ");
		}
	}
}
