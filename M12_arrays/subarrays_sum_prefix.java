
public class subarrays_sum_prefix
{
    public static void subarrays_sum(int arr[])
    {
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {   
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                 sum= i==0? prefix[j] : prefix[j]-prefix[i-1];
                 
                 System.out.println(sum);
                 if(sum>maxsum)
                 {
                    maxsum=sum;
                 }
            }
            System.out.println();
        }
        System.out.println("the maximum sum of subarrays is = "+maxsum);
    }
        
        
    public static void main(String args[])
    {
        int numbers[]={1,-2,6,-1,3};
        subarrays_sum(numbers);
    }
}