public class quicks {
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();  
    }
    public static void quicksort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pindex=partition(arr,si,ei);
        quicksort(arr,si,pindex-1);
        quicksort(arr,pindex+1,ei);
    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivot=arr[ei];
        int i=si-1;
        int j=si;
        for(j=si;j<ei;j++)
        {
            if(arr[j]<=pivot)
            {
                // swap
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        // swap pivot to their coorect position
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
        
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        quicksort(arr,0,arr.length-1);
        printarr(arr);
    }
}
