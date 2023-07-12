import java.util.*;

class matrix
{
	public static void main (String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Rows : ");
		int row=scan.nextInt();
		System.out.println("Enter The Coloumn : ");
		int col=scan.nextInt();

		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		int ans[][]=new int[row][col];

		System.out.println("------Enter The Data 1st Matrix------");
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter a["+i+"]["+j+"]");
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("------Enter The Data 2nd Matrix------");
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter b["+i+"]["+j+"]");
				b[i][j]=scan.nextInt();
			}
		}
		int choice=0;
		while(choice!=5)
		{
			System.out.println("1) For Addtion");
			System.out.println("2) For Subtraction");
			System.out.println("3) For Multiplication");
			System.out.println("4) For Display");
			System.out.println("5) For Exit");
			System.out.println("Enter Your Choice : ");
			choice=scan.nextInt();

			switch(choice)
			{
				case 1:
						for(int i=0;i<row;i++)
						{
							for(int j=0;j<col;j++)
							{
								ans[i][j]=(a[i][j]+b[i][j]);
							}
						}
						break;
				case 2:
						for(int i=0;i<row;i++)
						{
							for(int j=0;j<col;j++)
							{
								ans[i][j]=(a[i][j]-b[i][j]);
							}
						}
						break;
				case 3:
						for(int i=0;i<row;i++)
						{
							for(int j=0;j<col;j++)
							{
								for(int k=0;k<col;k++)
								{
									ans[i][j]+=(a[i][k]*b[k][j]);	
								}
							}
						}
						break;
						
				case 4:
						System.out.println("----------------------ANSWER--------------------");
						for (int i=0;i<row;i++)
						{
							for(int j=0;j<col;j++)
							{
								System.out.print(ans[i][j]+" ");
							}
							System.out.println();
						}
						break;
			}
		}
		
	}
}