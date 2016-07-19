/*@author Umar Farook
 */
import java.util.Scanner;

class Largest
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if(a>=b && a>=c)
			System.out.print("First");
		else if(b>=c)
			System.out.print("Second");
		else
			System.out.print("Third");
		in.close();
	}
}
