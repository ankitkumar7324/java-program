public class overloading 
{
    // // function to calculate the sum of two number 
    // public static int sum(int a,int b)
    // {
    //    return a+b;
    // }
    // // function to calculate the sum of three number
    // public static int sum(int a,int b,int c)
    // {
    //     return a+b+c;
    // }
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static float sum(float a,float b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        System.out.println(sum(3,5));
        // System.out.println(sum(3,5,7));
        System.out.println(sum(2.5f , 3.4f));
    }
} 