/*@author Umar Farook
 */
import java.util.Scanner;

class IndexEqualsValue
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==i)
			System.out.println(a[i]);
		}
		in.close();
	}
}
