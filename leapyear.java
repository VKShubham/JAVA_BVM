import java.util.*;

class leapyear
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Year : ");
		int year=scan.nextInt();

		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println(year+" Is a Leap Year");	
			}
			else
			{
				System.out.println(year+" Is Not a Leap Year");	
			}
		}
		else 
		{
			if(year%4==0)
			{
				System.out.println(year+" Is a Leap Year");
			}
			else 
			{
				System.out.println(year+" Is Not a Leap Year");
			}
		}
			
	}
}
