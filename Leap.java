/*@author Umar Farook
 */
import java.util.Scanner;

class Leap
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		if(a%400==0)
			System.out.print("Leap");
		else if(a%100==0)
			System.out.print("Non Leap");
		else if(a%4==0)
			System.out.print("Leap");
		else
			System.out.print("Non Leap");
		in.close();
	}
}
