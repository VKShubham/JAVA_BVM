import java.util.*;
public class dynamicstack{
    static int top = -1;
    static void push(int data,int n,int a[])
    {
        if(top == n-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            a[++top] = data;
        }
    }
    static void pop(int n,int a[])
    {
        if(top < 0)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            a[top] = 0;
            top--;
        }
    }
    static void peep(int a[])
    {
        System.out.println("The Value : "+a[top]);
    }
}

class operation
{
    public static void main(String[] args) {
        int choice = 0;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter Size Of Stack : ");
        n = scan.nextInt();
        dynamicstack obj = new dynamicstack();
        int a[] = new int[n];
        while(choice != 4)
        {
            System.out.println("1) PUSH");
            System.out.println("2) POP");
            System.out.println("3) PEEP");
            System.out.println("4) Exit");
            System.out.print("\n\nEnter Your choice : ");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                        System.out.print("\nenter a Value : ");
                        int data = scan.nextInt();
                        dynamicstack.push(data,n,a);
                        break;
                case 2:
                        dynamicstack.pop(n,a);
                        break;
                case 3:
                        dynamicstack.peep(a);
                        break;
            }
        }
        
    }
}