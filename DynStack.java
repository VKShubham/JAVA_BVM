import java.util.*;

interface Intstack
{
	void push(int data);
	void pop();
}

class Dynamic implements Intstack
{
	int top = -1;
	int n;
	Dynamic(int n)
	{
		this.n = n;
	}
	int[] stack = new int[n];
	public void push(int data)
	{
		if(stack.length == top+1)
		{
			int[] temp = new int[n*2];
			n = n * 2;
			for(int i=0; i<stack.length; i++)
			{
				temp[i] = stack[i];
			}
			stack = temp;
			stack[++top] = data;
		}
		else
		{
			stack[++top] = data;
		}
	}

	public void pop()
	{
		System.out.println("Element "+stack[top]+" POPED Out");
		stack[top--] = 0;
	}

	void display()
	{
		System.out.println("At the TOP Of the Stack Element : "+stack[top]);
	}
}
class DynStack
{
	public static void main(String[] args) 
	{
		Intstack mode;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Intial Size Of The Stack : ");
		int n = sc.nextInt();
		Dynamic d = new Dynamic(n);
		int choice  = 0; 
		while(choice != 4)
		{
			System.out.print("\n1) PUSH\n2) POP\n3) PEEP\n4) EXIT");
			System.out.print("\nEnter Your Choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
						System.out.print("\nEnter a Data : ");
						int data = sc.nextInt();
						d.push(data);
						break;
				case 2:	
						d.pop();
						break;
				case 3:
						d.display();
						break; 
			}
		}
	}	
}