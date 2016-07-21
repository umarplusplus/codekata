/*@author Umar Farook
 */
import java.util.Scanner;

class LargestHunter
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
				if(String.valueOf(a[j]).length()==String.valueOf(a[i]).length())
				{
					if(a[j]>a[i])
					{
						int temp=a[j];
						a[j]=a[i];
						a[i]=temp;
					}
				}
				else if(Integer.valueOf(String.valueOf(a[j]).charAt(0))>Integer.valueOf(String.valueOf(a[i]).charAt(0)))
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
				else if(Integer.valueOf(String.valueOf(a[j]).charAt(0))==Integer.valueOf(String.valueOf(a[i]).charAt(0)))
				{					
					if(String.valueOf(a[j]).length()<String.valueOf(a[i]).length())
					{
						if(Integer.valueOf(String.valueOf(a[i]).charAt(1))<Integer.valueOf(String.valueOf(a[j]).charAt(0)))
						{
							int temp=a[j];
							a[j]=a[i];
							a[i]=temp;
						}
					}
					else
					{
						if(Integer.valueOf(String.valueOf(a[j]).charAt(1))>Integer.valueOf(String.valueOf(a[i]).charAt(0)))
						{
							int temp=a[j];
							a[j]=a[i];
							a[i]=temp;
						}
					}
				}
			}
		}
		for(int i=0;i<n;i++)
		System.out.println(a[i]);
		in.close();
	}
}
