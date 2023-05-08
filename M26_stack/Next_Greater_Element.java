import java.util.*;
public class Next_Greater_Element {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int greaterElement[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1 ; i>=0 ;i--)
        {
            // Step 1 while
            while(!s.isEmpty() && arr[s.peek()] < arr[i])
            {
                s.pop();
            }
            // step 2 if else
            if(s.isEmpty())
            {
                greaterElement[i] = -1;
            }
            else
            {
                greaterElement[i] = arr[s.peek()];
            }
            // step 3 push into the stack
            s.push(i);
        }
        for(int i=0;i<greaterElement.length;i++)
        {
            System.out.print(greaterElement[i]+" ");
        }
    }
    
}

// output 8 -1 1 3 -1 
