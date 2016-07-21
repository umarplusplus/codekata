/*@author Umar Farook
 */
import java.util.ArrayList;
import java.util.Scanner;

class LeastPro
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		char[] c=String.valueOf(n).toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[j]<c[i])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		String b=new String(c);
		System.out.println(b.substring(0, b.length()-k));
		in.close();
	}
}
