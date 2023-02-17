public class subarrays
{
    public static void subarray(int arr[])
    {
        int tp=0;
        for(int i=0;i<arr.length;i++)
        {
            // System.out.print(arr[i]+"  ");
            for(int j=i;j<arr.length;j++)
            {
                // int sum=0;
                 for(int k=i;k<=j;k++)
                 {
                    System.out.print(arr[k]+" ");
                    // sum=sum+arr[k];
                 }
                 tp++;
                 System.out.println();
            }
            System.out.println();
        }
        System.out.println("total number of subarrays is = "+tp);
    }
    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10};
        subarray(numbers);
    }
}