


public class print_number {
    // decreasing function
    public static void printdec(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }
    
    // increasing function
    public static void printinc(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        printinc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {

        int n=10;

        printdec(n);
        System.out.println();
        printinc(n);
    }
}


