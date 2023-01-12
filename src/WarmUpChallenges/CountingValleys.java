package WarmUpChallenges;

import java.util.Scanner;

public class CountingValleys 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		int counter = 0;
		
		int valley = 0;
		
		int nterm = userInput.nextInt();
		
		String place = userInput.next();
		
		char []charr = place.toCharArray();
		
		for(int i=0;i<charr.length;i++)
		{
			if(charr[i]=='U')
			{
				counter++;
			}
			else if(charr[i]=='D')
			{
				counter--;
				
				if(counter == -1)
					valley++;
			}
		}
		
		System.out.println(valley);
		
		userInput.close();
		
	}

}
