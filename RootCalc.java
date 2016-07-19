/*@author Umar Farook
 */
import java.util.Scanner;

class RootCalc
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int x1=in.nextInt();
		int x2=in.nextInt();
		int y1=in.nextInt();
		int y2=in.nextInt();
		int c=(int) (Math.pow((x1+x2), 2)+Math.pow((y1+y2), 2));
		System.out.println(c);
		in.close();
	}
}
