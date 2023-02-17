import java.util.*;
public class ifelse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age of the human : ");
        int age=sc.nextInt();
        sc.close();
        // int age=22;
        if(age>18)
        {
            System.out.println("u r eliglible for driving and voting");
        }
        else
        {
            System.out.println("u r not eligible for driving and voting");
        }
    }
}