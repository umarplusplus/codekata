/*@author Umar Farook
 */
import java.io.IOException;
import java.util.Scanner;

class Alphabet
{
	public static void main(String args[]) throws IOException
	{
		Scanner in=new Scanner(System.in);
		char c=(char)System.in.read();
		if((c>=65 && c<=90) || (c>=97 && c<=122))
			System.out.print("Alphabet");
		else
			System.out.print("Not Alphabet");
		
	}
}
