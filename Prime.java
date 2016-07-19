/*@author Umar Farook
 */
import java.util.Scanner;

class Prime
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int i=2;
		for(;i<a;i++)
		{
			if(a%i==0)
				break;
		}
		if(i==a || a==2)
			System.out.print("Prime");
		else
			System.out.print("Not Prime");
		in.close();
	}
}
