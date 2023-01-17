package WarmUpChallenges;

import java.util.Scanner;

public class RepeatedString 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		String str = userInput.next();
		
		long limit = userInput.nextLong();
		
		long num = limit/str.length();
		
		long rem = limit%str.length();
		
		long ans = 0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a')
			{
				ans+=num;
				
				if(i<rem)
					ans++;
				
			}
		}
		
		System.out.println(ans);
		
		userInput.close();
	}
}
