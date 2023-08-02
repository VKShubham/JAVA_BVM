import java.util.*;
class info{
	String name;
	int marks[] = new int[10];
	float avarage;
	float pen;
	int total;

	void getdetails()
	{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter The Name of Student : ");
			name = scan.nextLine();
			System.out.println("Enter The Marks  : ");
			for (int i=0; i<4; i++)
			{
				marks[i] = scan.nextInt();
			}	
	}

	void avrage()
	{
		for (int i=0; i<4; i++)
		{
			total = total+marks[i]; 
		}
		avarage = total/5;
		System.out.println("The Avarage Of "+name+" Is a : "+avarage);
	}

	void percntageme()
	{
		pen = (total/5);
		System.out.println("The Percntage Of "+name+" Is a : "+pen+"%");
	}

}

class Objectofarray{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The No .of Student : ");
		int n = sc.nextInt();
		
		info obj[] = new info[n]; //Declaration
		for (int i=0; i<n ;i++)
		{
			 obj[i] = new info();
		}

		for (int i=0; i<n ;i++)
		{
			obj[i].getdetails();
			obj[i].avrage();
			obj[i].percntageme();
		}
	}
}