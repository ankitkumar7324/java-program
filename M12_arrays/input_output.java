import java.util.*;
public class input_output
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int marks[]=new int[50];
        // input
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        sc.close();
        // output
        System.out.println("phy = " + marks[0]);
        System.out.println("chem = " + marks[1]);
        System.out.println("math = " + marks[2]);
        // update
        marks[2]=marks[2]+2;
        System.out.println("math = " + marks[2]);

    }
}