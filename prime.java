import java.util.*;
public class prime {
    public static void main(String[] args) {
        System.out.println("Enter Number From Which Start : ");
        Scanner s = new Scanner(System.in);
        int lower = s.nextInt();
        System.out.println("Enter Number to end : ");
        int higher = s.nextInt();
        int count = 0;
        System.out.println("The Prime Numbers Between "+lower+" and "+higher+" Is : ");
        for(int i=lower; i<=higher; i++)
        { int flag = 0;
            for(int j=2; j<i; j++)
            {
                if(i % j == 0)
                {
                    flag = 0;
                    break;
                }else{
                    flag = 1;
                }
            }
            if(flag == 1)
            {
                System.out.println(i);
            }
        }
    }
}
