import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter a Number : ");
        number = scan.nextInt();
        int n = number,i = 0;
        int cube = 0;
        int sum = 0;
        while(n>0)
        {
            i = n % 10;
            cube = (i*i*i);
            sum += cube;
            n = n / 10;
        }
        if(number == sum)
        {
            System.out.println("number is a armstrong");
        }else{
            System.out.println("number is not armstrong");
        }
    }
}
