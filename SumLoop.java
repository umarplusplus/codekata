/*@author Umar Farook
 */
import java.util.Scanner;

class SumLoop
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++)
			sum+=i;
		System.out.print(sum);
		in.close();
	}
}
