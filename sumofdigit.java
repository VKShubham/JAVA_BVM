import java.util.Scanner;

class sumofdigit{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = scan.nextInt();
        int sum = 0,i;
        while(n>0)
        {
            i = n % 10;
            sum += i;
            n = n / 10; 
        }
        System.out.println("The Sum Of Digit Is : "+sum);
    }
}