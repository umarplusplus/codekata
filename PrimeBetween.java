/*@author Umar Farook
 */
import java.util.Scanner;

class PrimeBetween
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		for(int i=a;i<=b;i++)
		{
			int j=2;
			for(;j<i;j++)
			{
				if(i%j==0)
					break;
			}
			if(j==i)	
				System.out.println(i);
		}
		in.close();
	}
}
