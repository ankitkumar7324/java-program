import java.util.*;
public class syntaxwith_parameter
{
    // this is true for void return type
    // 
    // public static void calculatesum(int num1,int num2)
    // {
    //     int sum=num1+num2;
    //     System.out.println("sum is = "+sum);
    // }
    // public static void main(String args[])
    // {
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     calculatesum(a,b);
    // }
    public static int calculatesum(int num1,int num2)  //parameter or formal parameter
    {
        int sum=num1+num2;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int sum=calculatesum(a,b);  //arguments or actual parameter
        System.out.println("sum is = "+sum);
    }
    // this is for int return type and for this u must declare return at the end
}