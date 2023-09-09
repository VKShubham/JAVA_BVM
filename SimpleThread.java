class SimpleThread
{
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Thread Details:\t"+t);

		t.setName("Shubham");

		System.out.println("Thread Details (After Changing the Name):\t"+t);
	}
}