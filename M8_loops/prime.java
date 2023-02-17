import java.util.*;
public class prime
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number :");
    int n=sc.nextInt();
    sc.close();
    int count=0;
    // for(int div=2;div<n;div++)
    // for optimization of this code we use div<sqrt(n)
    for(int div=2;div<Math.sqrt(n);div++)
    {
        if(n%div==0)
        {
            count=1;
            
        }
    }
    if(count==0)
    {
      System.out.println(n +" is prime");
    }
    else
    {
      System.out.println(n +" is not   prime");

    }
  }
}