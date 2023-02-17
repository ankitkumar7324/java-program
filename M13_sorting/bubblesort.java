
public class bubblesort 
{
    public static void bubble_sort(int arr[])
    {
        int swap=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                // swap
                {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap=1;
                }
            }
            if(swap==0)
            {
                break;
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
        bubble_sort(arr);
        printarray(arr);
    }
}