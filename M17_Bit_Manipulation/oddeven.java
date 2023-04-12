

public class oddeven {
    public static void oddOrEven(int n)
    {
        int bitMask = 1;
        if((n&bitMask) == 0)
        {
            System.out.println(n+" is even number");

        }
        if((n&bitMask) == 1)
        {
            System.out.println(n+ " is odd number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(21);
        oddOrEven(14);
    }
}
