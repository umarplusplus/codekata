/*@author Umar Farook
 */
import java.util.Scanner;

class Power
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.print(Math.pow(a, b));
		in.close();
	}
}
