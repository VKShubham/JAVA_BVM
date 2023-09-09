import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        int n = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        n = scan.nextInt(); 
        int d_n = n;     
        int sum = 0;  
        int a;
        while(n > 0)
        {
            a = n % 10;
            sum = (sum*10)+a;
            n = n / 10;
        }
        if(d_n == sum)
        {
            System.out.println(d_n+" Is Palindrome Number");
        }else{
            System.out.println(d_n+" Is Not Palindrome Number");
        }
    }
}
