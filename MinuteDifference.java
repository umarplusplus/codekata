/*@author Umar Farook
 */
import java.util.Scanner;

class MinuteDifference
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String a=in.next();
		String b=in.next();
		String[] t1=a.split(":");
		String[] t2=b.split(":");
		int min=0;
		int h1=Integer.valueOf(t1[0]);
		int h2=Integer.valueOf(t2[0]);
		int m1=Integer.valueOf(t1[1]);
		int m2=Integer.valueOf(t2[1]);
		int sum=Math.abs((h1*60+m1)-(h2*60+m2));
		System.out.println(sum);
		in.close();
	}
}
