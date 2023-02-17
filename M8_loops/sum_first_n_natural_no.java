import java.util.*;
public class sum_first_n_natural_no
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n=sc.nextInt();
        sc.close();
        int counter =1;
        int sum=0;
        while(counter<=n)
        {
            // sum=sum+counter;
            sum+=counter;
            counter++;
        }
        System.out.println("sum of first "+ n + " natural number = " + sum);
    }
}