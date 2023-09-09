class MyThread implements Runnable
{
	Thread t;

	MyThread()
	{
		t = new Thread(this,"Child Thread");
		t.start();
	}

	public void run()
	{
		try{
			for(int i=1; i<=5; i++)
			{
				System.out.println(t.getName()+" "+i);
				t.sleep(500);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Exception Caught : ");
		}
	}
}
class ThreadDemo
{
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		Thread t = Thread.currentThread();
		try{
			for(int i=6; i<=10; i++)
			{
				System.out.println(t.getName()+" "+i);
				t.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Exception Caught : ");
		}
	}
}