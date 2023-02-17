public class binary_search
{
    public static int binarysearch(int numbers[],int key)
    {
        int start=0;
        int end=numbers.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(numbers[mid]==key)
            {
                return mid;
            }
            else if(numbers[mid]>key)
            {
                end=mid-1;
            }
            else
            {
               start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10,12,14};
        int key =14;
        int index=binarysearch(numbers,key);
        if(index==-1)
        {
            System.out.println("key is not found");
        }
        else
        {
           System.out.println("key is found at : "+index);
        }
    }
}