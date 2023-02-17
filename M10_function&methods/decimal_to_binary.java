public class decimal_to_binary
{
    public static void dectobin(int n)
    {
        int mynum=n;
       int pow=0;
       int binnum=0;
       while(n>0)
       {
       int remainder=n%2;
       binnum=binnum + (int)(remainder*Math.pow(10,pow));
       pow++;
       n=n/2;
       }
       System.out.println("decimal to binary of "+ mynum+" is = "+binnum);
    }
    public static void main(String args[])
    {
        dectobin(15);
    }
}