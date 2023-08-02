import java.util.*;
class tempratureconversion
{
	public static void main (String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("1) Celcius To Farnhiet");
		System.out.println("1) Farnhiet To Celcius");
		System.out.println("Enter Your Choice : ");
		int choice=scan.nextInt();
		if (choice == 1)
		{
			System.out.println("Enter The Celcius");
			double c=scan.nextDouble();
			double ans=(c*9/5)+32;
			System.out.println("Farnhiet : " +ans );
		}
		else if (choice == 2)
		{
			System.out.println("Enter The Farnhiet");
			double f=scan.nextDouble();
			double ans=(f*32)+(5/9);
			System.out.println("Celcius : " +ans );
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}
}