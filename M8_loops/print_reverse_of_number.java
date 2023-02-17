public class print_reverse_of_number 
{
    public static void main(String args[])
    {
        int n=10899;
        while(n!=0)
        {
            int digit=n%10;
            System.out.print(digit);
            n/=10; 
        }
    }
}