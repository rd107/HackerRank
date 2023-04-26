package array;

import java.util.Scanner;

public class TwoDimensionalArray 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
        int sum = -1000;
        int [][]arr = new int[6][6];
        
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                arr[i][j] = userInput.nextInt();
            }
        }
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                int top = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                int middle = arr[i+1][j+1];
                int bottom = arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(top+middle+bottom>sum)
                {
                    sum=top+middle+bottom;
                }
            }
        }
        
        System.out.println(sum);
        
        userInput.close();
	}
}
