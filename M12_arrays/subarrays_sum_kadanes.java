
public class subarrays_sum_kadanes
{
    public static void subarrays_sum(int arr[])
    {
         int maxsum=Integer.MIN_VALUE;
         int sum=0;
         for(int i=0;i<arr.length;i++)
         {
            sum=sum+arr[i];
            if(sum<0)
            {
               sum=0;
            }
            maxsum=Math.max(maxsum,sum);
         }
         System.out.println("the maximum sum of subarrays is = "+maxsum);
    }
    public static void main(String args[])
    {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
         int marks[]={1,-2,6,-1,3};
        subarrays_sum(numbers);
        subarrays_sum(marks);
    }
}