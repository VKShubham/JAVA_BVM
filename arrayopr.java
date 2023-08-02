import java.util.*;
class arrayopr{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("1) For Insert An Element");
		System.out.println("2) For Delete An Element");
		System.out.println("3) For Display Array");
		System.out.println("4) For Exit");
		System.out.print("Enter Your Choice : ");
		int choice = scan.nextInt();

		while (choice != 4)
		{
			if (choice == 1)
			{
				int insertchoice = 0;
				while(insertchoice != 3)
				{
					System.out.println("1) Insert Via Index");
					System.out.println("2) Insert Line By Line");
					System.out.println("3) For Exit");
					System.out.print("Enter Your Choice : ");
					insertchoice = scan.nextInt();
					if (insertchoice == 1)
					{
						System.out.print("Enter The number of an Index : ");
						int index = scan.nextInt();
						System.out.print("Enter The Value of an Index : ");
						int value = scan.nextInt();
						a[index] = value;
					}	
					else
					{
						for (int i=0; i<n; i++)
						{
							System.out.print("Enter The Value of a["+i+"] : ");
							a[i] = scan.nextInt();
							System.out.println();
						}
					}
				}
				
			}
			else if(choice == 2)
			{

			}
			else
			{
				for (int i=0; i<n; i++)
				{
					System.out.println("a["+i+"] = "+a[i]);
				}
			}
		}
	}
}