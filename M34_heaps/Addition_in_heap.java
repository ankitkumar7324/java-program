import java.util.*;

public class Addition_in_heap 
{
    public static class Heap
    {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data)  //whole t.c of addition function is 0(logn)
        {
            // add at last index
            arr.add(data);  //o(1)

            int x = arr.size()-1;  //child index
            int par = (x-1)/2;     //parent index

            while(arr.get(x) < arr.get(par))  //0(logn)
            {

                // swap
                int temp = arr.get(x);
                arr.set(x , arr.get(par));
                arr.set(par , temp);

                x = par;
                par = (x-1)/2;
            }
        }
        
        // get minimum in the heap
        public int peek()
        {
            return arr.get(0);
        }
    }      

    public static void main(String[] args) 
    {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        System.out.println(h.peek());
    }   
}
