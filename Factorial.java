/*@author Umar Farook
 */
import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int f = 1;
		for(int i=1;i<=a;i++)
			f=f*i;
		System.out.println(f);
		in.close();
	}
}
