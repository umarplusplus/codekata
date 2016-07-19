/*@author Umar Farook
 */
import java.util.Scanner;

class Positive
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=in.nextInt();
		if(n>0)
			System.out.print("Positive");
		else if(n==0)
			System.out.print("Zero");
		else
			System.out.print("Negative");
		
	}
}
