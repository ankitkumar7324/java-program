public class largest_of_3
{
    public static void main(String args[])
    {
        int a=1,b=7,c=6;
        if(a>=b && a>=c)
        {
            System.out.println("A is greatest");
        }
        else if(b>=c)
        {
            System.out.println("B is greatest");
        }
        else
        {
            System.out.println("C is greatest");
        }
    }
}