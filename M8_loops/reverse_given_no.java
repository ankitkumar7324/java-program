public class reverse_given_no
{
    public static void main(String args[])
    {
        int n=10899;
        int rev=0;
        while(n>0)
        {
            int digit=n%10;
            rev=(rev*10)+digit;
            n/=10;
        }
        System.out.println("the reverse of number is = " +rev);
    }
}