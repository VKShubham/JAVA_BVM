import java.util.*;
class MyException extends Exception
{
	MyException(String s)
	{
		System.out.println(s);
	}
}

class Person 
{
	void ValidateAge(String name, int age) throws MyException
	{
		if(age>=1 && age<=120 && name.startsWith("RAM"))
		{
			System.out.println("\n INPUT IS VALID ");
		}
		else
		{
			throw new MyException("!!!INPUT IS NOT VALID!!!");
		}
	}
}

class CustomExcpetionExam
{
	public static void main(String[] args)
	{
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a Name : ");
		String name = sc.nextLine();
		System.out.print("\nEnter a Age : ");
		int age = sc.nextInt();
		try
		{
			p.ValidateAge(name,age);
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}