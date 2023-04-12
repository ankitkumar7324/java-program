

public class update_ithbit {
    public static int setIthBit(int n,int i)
    {
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n , int i)
    {
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static int updateIthBit(int n, int i , int newbit)
    {
        // approach 1
        // if(newbit == 0) 
        // {
        //     return clearIthBit(n, i);
        // }
        // else
        // {
        //     return setIthBit(n, i);
        // }
        
        // approach 2

        n = clearIthBit(n, i);
        int bitMask = newbit<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
    
}
