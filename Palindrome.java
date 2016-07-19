/*@author Umar Farook
 */
import java.util.Scanner;

class Palindrome
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		Integer b=Integer.valueOf(new StringBuffer(String.valueOf(a)).reverse().toString());
		if(a==b.intValue())
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
		in.close();
	}
}
