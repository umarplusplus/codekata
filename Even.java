/*@author Umar Farook
 */
import java.util.Scanner;

class Even
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n%2==0)
			System.out.print("Even");
		else
			System.out.print("Odd");
		
	}
}
