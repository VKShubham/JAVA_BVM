import java.util.*;
class info{
	String name;
	int maths;
	int science;
	int physics;
	int english;
	int gujarati;
	float avarage;

	void getdetails()
	{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter The Name of Student : ");
			name = scan.nextLine();
			System.out.println("Enter The Marks of Maths : ");
			maths = scan.nextInt();
			System.out.println("Enter The Marks of Science : ");
			science = scan.nextInt();
			System.out.println("Enter The Marks of Physics : ");
			physics = scan.nextInt();
			System.out.println("Enter The Marks of Englsih : ");
			english = scan.nextInt();
			System.out.println("Enter The Marks of Gujarati : ");
			gujarati = scan.nextInt();
	}

	void avrage()
	{
		avarage = (maths+science+physics+english+gujarati) / 5;
		System.out.println("The Avarage Of "+name+" Is a : "+avarage);
	}

}

class student{
	public static void main(String []args){
	
		info obj = new info();
		info obj1 = new info();
		info obj2 = new info();
		info obj3 = new info();
		info obj4 = new info();

		obj.getdetails();
		obj.avrage();

		obj1.getdetails();
		obj1.avrage();

		obj2.getdetails();
		obj2.avrage();

		obj3.getdetails();
		obj3.avrage();

		obj4.getdetails();
		obj4.avrage();
	}
}