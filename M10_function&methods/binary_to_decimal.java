public class binary_to_decimal
{
    public static void binToDec(int n)
    {
        int mynum=n;
        int pow=0;
        int decnum=0;
        while(n>0)
        {
            int lastdigit=n%10;
            decnum=decnum +(int)(lastdigit*Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println("binary to decimal of "+ mynum + " is = " + decnum);
    }
    public static void main(String args[])
    {
        binToDec(1001);
    }

}