// it isfor minheap

import java.util.*;

public class delete_in_heap 
{
     static class Heap
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
        
        private void heapify(int i)
        {
            int left = 2*i+1;
            int right = 2*i+2;
            int minidx = i;

            if(left<arr.size() && arr.get(left)<arr.get(minidx))
            {
                minidx = left;
            }
            if(right<arr.size() && arr.get(right)<arr.get(minidx))
            {
                minidx = right;
            }

            if(minidx != i)
            {
                // swap
                int temp = arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);

                heapify(minidx);
            }

            
        }

        // to  delete a element in the heap
        public int remove()
        {
            int data = arr.get(0);

            // step - 1 swap 1st and last element
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            // step-2 remove last element

            arr.remove(arr.size()-1);

            // step-3 fix the heap = heapify
            heapify(0);
            return data;


        }

        public boolean isEmpty()
        {
            return arr.size() == 0;
        }
    }      

    public static void main(String[] args) 
    {
         Heap h = new Heap();
         h.add(3);   
         h.add(2);   
         h.add(5);   
         h.add(1);
         
         while(!h.isEmpty())
         {
            System.out.println(h.peek());
            h.remove();
         }
    }   
}

