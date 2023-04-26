package WarmUpChallenges;

import java.util.Scanner;

public class RepeatedString 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		String str = userInput.next();
		
		long n = userInput.nextLong();
		
		long NoOfReps = n/str.length();
		
		long rem = n%str.length();
		
		long total = 0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a')
			{
				total++;
			}
		}
		
		total = total * NoOfReps;
		
		for(int i=0;i<rem;i++)
		{
			if(str.charAt(i)=='a')
			{
				total++;
			}
		}
		
		System.out.println(total);
		
		userInput.close();
	}
}
