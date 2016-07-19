/*@author Umar Farook
 */
import java.util.Scanner;

class CountDigit
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int sum=0;
		for(;a>0;)
		{
			sum++;
			a=a/10;
		}
		System.out.print(sum);
		in.close();
	}
}
