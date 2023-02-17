import java.util.Collections;
public class inbuildsort
{
     public static void printarray(Integer arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Integer arr[]={3,5,8,2,1,7,4};
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,4);
        Arrays.sort(arr,Collections.reverseOrder()); 
        printarray(arr);
    }
}