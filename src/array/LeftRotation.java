package array;

import java.util.Scanner;

public class LeftRotation 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        int rotation = userInput.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) 
        {
            arr[i] = userInput.nextInt();
        }

        int[] temparr = new int[n];
        int cnt = 0;
        
        for (int i = rotation; i < n; i++) 
        {
        	temparr[cnt] = arr[i];
            cnt++;
        }

        int count = n - rotation;
        for (int i = 0; i < rotation; i++) 
        {
        	temparr[count] = arr[i];
            count++;
        }

        for (int i : temparr) 
        {	
            System.out.print(i + " ");
        }
        
        userInput.close();
	}
}
