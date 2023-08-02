import java.util.*;
class result
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Marks OF Maths : ");
		int maths=scan.nextInt();
		System.out.println("Enter The Marks OF Physics : ");
		int phy=scan.nextInt();
		System.out.println("Enter The Marks OF Chemstiry : ");
		int che=scan.nextInt();
		int total= (maths+phy+che)/3;
		if( total <=100 && total >=85)
		{
			System.out.println("First Class With Distinction");
		}
		else if( total <=85 && total >=70 )
		{
			System.out.println("First Class");
		}
		else if( total <=70 && total >=50 )
		{
			System.out.println("Second Class");
		}
		else if( total <=50 && total >=33 )
		{
			System.out.println("Pass Class");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}