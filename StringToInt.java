/*@author Umar Farook
 */
import java.util.Scanner;

class StringToInt
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String a=in.next();
		System.out.println(Integer.valueOf(a));
		in.close();
	}
}
