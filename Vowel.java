/*@author Umar Farook
 */
import java.io.IOException;
import java.util.Scanner;

class Vowel
{
	public static void main(String args[]) throws IOException
	{
		Scanner in=new Scanner(System.in);
		char c=(char)System.in.read();
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			System.out.print("Vowel");
		else
			System.out.print("Consonant");
		
	}
}
