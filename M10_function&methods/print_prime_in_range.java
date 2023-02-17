public class print_prime_in_range
{
    public static boolean isprime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
               return false;
            }
        }
        return true;
    }
    public static void printprime(int n)
    {
       for(int i=2;i<=n;i++)
       {
        if(isprime(i)==true)
        {
            System.out.print(i + " ");
        }
       }
    }
    public static void main(String args[])
    {
        int n=20;
        System.out.print("the all prime number in range of " + n + " is = ");
        printprime(n);
    }
}