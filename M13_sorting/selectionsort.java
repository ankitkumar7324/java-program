
public class selectionsort 
{
    public static void selection_sort(int arr[])
    {
        // int swap=0;
        for(int i=0;i<arr.length-1;i++)
        {
            int minpos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minpos]>arr[j])
                {
                    minpos=j;
                }
                int temp=arr[minpos];
                arr[minpos]=arr[i];
                arr[i]=temp;
            }
          
        }
    }
    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[]={1,6,4,3,5,2};
        selection_sort(arr);
        printarray(arr);
    }
}