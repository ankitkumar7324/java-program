import java.util.*;
public class max_Area_in_Histogram {
    public static int maxAreaHistogram(int ht[])
    {
        int maxArea = 0;
        int nsr[] = new int[ht.length];
        int nsl[] = new int[ht.length];
        // next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i = ht.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && ht[s.peek()] >= ht[i] )
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsr[i] = ht.length;
            }
            else
            {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s = new Stack<>();
        for(int i = 0;i< ht.length;i++)
        {
            while(!s.isEmpty() && ht[s.peek()] >= ht[i] )
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsl[i] = -1;
            }
            else
            {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // calculating area of histogram
        for(int i =0 ;i<ht.length;i++)
        {
        int height = ht[i];
        int width = nsr[i] - nsl[i] - 1;
        int currArea = height * width;
        maxArea = Math.max(currArea,maxArea);
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int height[] = {2,1,5,6,2,3};
        System.out.println(maxAreaHistogram(height));
    }
}
