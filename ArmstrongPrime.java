import java.util.Scanner;
class MyThread implements Runnable
{
	Thread t;
	int start;
	int end;
	MyThread(int d_start, int d_end)
	{
		t = new Thread(this,"Child Thread");
		t.start();
		start = d_start;
		end = d_end;
	}

	public void run()
	{
		try{
			for(int i=start; i<=end; i++)
			{
				if(i<=0)
				{
					System.out.println(i+" Is a Negative");
				}
				else
				{
					System.out.println(i+" Is a Negative");	
				}
				t.sleep(900);
				
			}
		}catch(InterruptedException e)
		{
			System.out.println("Exception Caught : ");
		}
	}
}
class ArmstrongPrime
{
	public static void main(String[] args) {
	
		System.out.print("\n\n---------Enter a Range---------\n\n");
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter Range (START) : ");
		int start = scan.nextInt();
		System.out.print("\nEnter Range (END) : ");
		int end =  scan.nextInt();
		MyThread t = new MyThread(start,end);
		Thread t1 = Thread.currentThread();

		int temp = 2;
		for(int i = start; i<=end; i++)
		{
			try
			{
				if(i % temp == 0)
				{
					System.out.println(i+" Is Not Prime");
				}
				else
				{
					System.out.println(i+" Is a Prime");	
				}
				temp++;
				t1.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception Caught : ");
			}
		}
	}
}