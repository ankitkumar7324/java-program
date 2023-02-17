import java.util.*;
public class income_tax
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the income of person :");
      int income=sc.nextInt();
      sc.close();
      float tax;
      if(income<5)
      {
      tax=0;
      }
      else if(income >= 5 && income <10)
      {
        tax=income*0.2f;
      }
      else
      {
        tax=income*0.3f;
      }
      System.out.println(tax);
    }
}