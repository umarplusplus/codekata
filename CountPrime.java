/*@author Umar Farook
 */
import java.util.Scanner;

class CountPrime
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++)
		{
			int j=2;
			for(;j<i;j++)
			{
				if(i%j==0)
					break;
			}
			if(j==i)	
				sum++;
		}
		System.out.println(sum);
		in.close();
	}
}
