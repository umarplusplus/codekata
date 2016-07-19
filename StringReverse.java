/*@author Umar Farook
 */
import java.util.Scanner;

class StringReverse
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String a=in.next();
		System.out.println(new StringBuffer(a).reverse().toString());
		in.close();
	}
}
