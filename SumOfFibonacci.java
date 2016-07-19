/*@author Umar Farook
 */
import java.util.Scanner;

class SumOfFibonacci
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=1,b=1,c=0;
		int sum=0;
		if(n==1)
			sum=1;
		else
			sum=2;
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			sum+=c;
		}
		System.out.println(sum);
		in.close();
	}
}
