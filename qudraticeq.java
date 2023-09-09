import java.util.Scanner;
public class qudraticeq {
    public static void main(String[] args) {
		int a;
        int b;
        int c;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		a = scan.nextInt();

		System.out.print("Enter the value of b : ");
		b = scan.nextInt();

		System.out.print("Enter the value of c : ");
		c = scan.nextInt();

		double d = ((b*b) - 4*a*c);

		if(d < 0) {
			System.out.println("\nThe equation is imaginary");
		} else {
			double root1 = (-b + Math.sqrt(d)) / (2 * a);
			double root2 = (-b - Math.sqrt(d)) / (2 * a);

			System.out.print("\nThe root for " + a + "x + " + b + "x^1 + " + "x^2 : \nRoot 1 : " + root1 + "\nRoot 2 : " + root2);
		}
 	}
}
