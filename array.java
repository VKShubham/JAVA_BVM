import java.util.*;
class array
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Size Of an array : ");
		int n = scan.nextInt();
		int a[] = new int[n+100];
		int choice = 1;
		while(choice != 3)
		{
			System.out.println("1) Insert Element In array");
			System.out.println("2) Display The array");
			System.out.println("3) Exit");
			System.out.print("Enter Your Choice : ");
			choice = scan.nextInt();

			switch(choice)
			{
				case 1:
						int choice1 = 1;
						while(choice1 != 4)
						{
							System.out.println("1) Insert Element In array Via Value");
							System.out.println("2) Insert Via Positon");
							System.out.println("3) Insert Line By Line");
							System.out.println("4) Exit");
							System.out.print("Enter Your Choice : ");
							choice1 = scan.nextInt();	
							switch(choice1)
							{
								case 1:
										System.out.print("Enter a Value : ");
										int value = scan.nextInt();
										int pos=0,temp=0;
										for(int i=0; i<n; i++)
										{
											if(a[i] == value)
											{
												System.out.println("The Value Found at a["+i+"]");
												temp++;
												pos = i;

											}
										}
										int insertchoice,insertvalue;
										if(temp != 0)
										{
											System.out.println("\n1) Before The Value");
											System.out.println("2) After The Value");
											System.out.print("Enter Your Choice : ");
											insertchoice = scan.nextInt();

											if(insertchoice == 1)
											{
												System.out.print("Enter The value to be inserted : ");
												insertvalue = scan.nextInt();
												a[pos-1] = insertvalue;
											}
											else
											{
												System.out.print("Enter The value to be inserted : ");
												insertvalue = scan.nextInt();
												a[pos+1] = insertvalue;
											}
										}
										else
										{
											System.out.println("\n\nValue Not Found In the array");
										}
										
										break;
								case 2:
										break;
								case 3:
										for(int i=0; i<n; i++)
										{
											System.out.print("Enter a["+i+"] : ");
											a[i] = scan.nextInt();
											System.out.println();
										}
										break;
							}
						}
						
						break;
				case 2:
						System.out.print("\n\n--------Array-------\n\n");
						for(int i=0; i<n; i++)
						{
							System.out.print(a[i]+" , ");
						}
						break; 
			}
		}

	}
}