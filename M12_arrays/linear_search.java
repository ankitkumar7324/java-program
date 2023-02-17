public class linear_search
{
    public static int linearsearch(int numbers[],int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==key)
            {
                return i;
            }
        }
        return -1;
        // System.out.println("key not found");
    }
    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=15;
        System.out.println(linearsearch(numbers,key));
    }
}