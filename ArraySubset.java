/*@author Umar Farook
 */
import java.util.ArrayList;
import java.util.Scanner;

class ArraySubset
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<Integer> a1=new ArrayList();
		for(int i=0;i<n;i++)
			a1.add(in.nextInt());
		int m=in.nextInt();
		ArrayList<Integer> a2=new ArrayList();
		for(int i=0;i<m;i++)
			a2.add(in.nextInt());
		if(a2.containsAll(a1))
			System.out.println("Yes");
		else
			System.out.println("No");
		in.close();
	}
}
