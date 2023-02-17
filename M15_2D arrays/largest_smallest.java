import java.util.*;
public class largest_smallest 
{
    public static int largest(int matrix[][])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]>largest)
                {
                    largest=matrix[i][j];
                    
                }
            }
        }
            return largest;
    //   same logic we use for smallest element in 2 d array
        
    }
    public static void main(String args[])
    {
        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int n=matrix.length , m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
        // output
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int large=largest(matrix);
  System.out.println("largest element is : " +large );
    }

}