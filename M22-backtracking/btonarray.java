public class btonarray{
    public static void changearr(int arr[],int i,int v)
    {
        // base case
        if(i==arr.length)
        {
           printarr(arr);
           return;
        }
        // recursion
        arr[i]=v;
        changearr(arr, i+1, v+1); // functin call step
        arr[i]=arr[i]-2; //backtracking step
    }
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changearr(arr, 0, 1);
        printarr(arr);
    }
}