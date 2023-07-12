import java.util.*;
class xvaluefinder
{
	static int factorial(int x)
	{
		int fact=1;
		for (int i=1;i<=x;i++)
		{
			fact = fact * i;
		}
		return fact;
	}
	public static void main (String args[])
	{
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int ans = factorial(x);
		System.out.println(ans);
	}
}