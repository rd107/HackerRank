package WarmUpChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class SalesByMatch 
{

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		int pair_count = 0;
		int nterms = userInput.nextInt();
		
		int []socks_array = new int[nterms];
		
		for(int i=0;i<nterms;i++)
		{
			socks_array[i]=userInput.nextInt();
		}
		
		Arrays.sort(socks_array);
		
		for(int i=0;i<socks_array.length-2;i++)
		{
			if(socks_array[i]==socks_array[i+1])
			{
				pair_count++;
				socks_array[i]=0;
				socks_array[i+1]=0;
			}
		}
		
		System.out.println(pair_count);
	}

}
