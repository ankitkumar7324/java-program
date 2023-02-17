
public class fibonacci {
    static int fibbo(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return fibbo(n-1)+fibbo(n-2);
        
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibbo(6));
    }
}

