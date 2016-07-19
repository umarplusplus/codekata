/*@author Umar Farook
 */
import java.util.Scanner;

class DigitReverse
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		System.out.println(new StringBuffer(String.valueOf(a)).reverse().toString());
		in.close();
	}
}
