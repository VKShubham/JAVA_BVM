import java.util.*;
class calculator
{
	public static void main (String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The 1st Number");
		int a=scan.nextInt();
		System.out.println("Enter The 2nd Number");
		int b=scan.nextInt();
		System.out.println("1) For Addtion");
		System.out.println("2) For Subtraction");
		System.out.println("3) For Multiplication");
		System.out.println("4) For Division");
		System.out.println("5) For Modulo");
		System.out.println("Enter Your Choice : ");
		int choice=scan.nextInt();

		if (choice == 1)
		{
			System.out.println(a+" + "+b+" = "+(a+b));
		}
		else if(choice == 2)
		{
			System.out.println(a+" - "+b+" = "+(a-b));
		}
		else if(choice == 3)
		{
			System.out.println(a+" * "+b+" = "+(a*b));
		}
		else if(choice == 4)
		{
			System.out.println(a+" / "+b+" = "+(a/b));
		}
		else
		{
			System.out.println(a+" % "+b+" = "+(a%b));
		}
	}
}