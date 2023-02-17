import java.util.*;
public class calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a : ");
        int a=sc.nextInt();
        System.out.println("enter the value of b : ");
        int b=sc.nextInt();
        System.out.println("enter the operation u want to do : " );
        char operator=sc.next().charAt(0);
        sc.close();
        switch(operator)
        {
            case '+':
            {
               System.out.println("a+b = "+ (a+b));
               break;
            }
            case '-':
            {
               System.out.println("a-b = " + (a-b));
               break;
            }
            case '*':
            {
               System.out.println("a*b = " + (a*b));
               break;
            }
            case '/':
            {
               System.out.println("a/b = " + (a/b));
               break;
            }
            default :
               System.out.println("invalid operator");

        }
    }
}