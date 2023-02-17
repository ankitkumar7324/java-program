import java.util.*;
public class square_pattern
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the no. of rows:");
     int n=sc.nextInt();
     sc.close();
     for(int i=1;i<=n;i++)
     {
        System.out.println("* * * *");
     }
   }
}