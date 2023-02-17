
public class subarrays_sum_brutal
{
    public static void subarrays_sum(int arr[])
    {
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {   
            for(int j=i;j<arr.length;j++)
            {
                 int sum=0;
                 for(int k=i;k<=j;k++)
                 {
                     sum=sum+arr[k];
                 }
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