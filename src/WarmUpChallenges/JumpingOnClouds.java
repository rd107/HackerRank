package WarmUpChallenges;

import java.util.Scanner;

public class JumpingOnClouds 
{ 
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		int counter = 0;
		
		int nterms = userInput.nextInt();
		
		int clouds[] = new int[nterms];
		
		int jumps = 0;
		
		for(int i=0;i<nterms;i++)
		{
			clouds[i]=userInput.nextInt();
		}
		
		for(int i=0;i<nterms;i++)
		{
			if(clouds[i]==0)
			{
				++counter;
			}
		}
		
		jumps = counter - 1;
		
		System.out.print(jumps);
		
	}
	
}
