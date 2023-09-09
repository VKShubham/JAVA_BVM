import java.util.Scanner;

public class series {
    static int factorial(int x)
	{
		int fact=1;
		for (int i=1;i<=x;i++)
		{
			fact = fact * i;
		}
		return fact;
	}
    public static void main(String[] args) {
		int x, n;
		double ans = 1;
		Scanner scan = new Scanner(System.in);

		System.out.println("\n\n.....Searies 1.....");
		System.out.print("Enter the value of x : ");
		x = scan.nextInt();

		System.out.print("Enter value of n : ");
		n = scan.nextInt();

		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				ans += Math.pow(x, i) / factorial(i);
			} else {
				ans -= Math.pow(x, i) / factorial(i);
			}
		}

		System.out.println("\nSearies is : 1 - x + ((x ^ 2) / 2!) - ((x ^ 3) / 3!) + ... + ((x ^ n) / n!)");
		System.out.println("\nEquation result for x = " + x + " and to n = " + n + " is : " + ans);
	}
}
