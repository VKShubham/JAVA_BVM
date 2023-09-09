import java.util.*;

public class fibo {
    public static void main(String[] args) {
        int n;
        int a = 0;
        int b = 1;
        int c = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("\n\nFibonacci Series");
		System.out.print("\nEnter number for fibonacci series upto that number : ");
		n = scan.nextInt();

		for(int i = 0; (a + b) <= n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
    }

