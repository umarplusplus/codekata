/*@author Umar Farook
 */
import java.util.Scanner;

class CloseZero
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		int min=a[0]+a[1];
		int x=a[0],y=a[1];
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Math.abs(a[i]+a[j])<min)
				{
					min=Math.abs(a[i]+a[j]);
					x=a[i];
					y=a[j];
				}
			}
		}
		System.out.println(x+" "+y);
		in.close();
	}
}
