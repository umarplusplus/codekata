/*@author Umar Farook
 */
import java.util.ArrayList;
import java.util.Scanner;

class BinaryInt
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
			for(int j=i+1;j<n;j++)
			{
				String[] bin1=Integer.toBinaryString(a[i]).concat("0").split("1");
				String[] bin2=Integer.toBinaryString(a[j]).concat("0").split("1");
				if(bin2.length>bin1.length)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				else if(bin2.length==bin1.length)
				{
					if(a[j]>a[i])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;	
					}
				}
				
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		in.close();
	}
}
