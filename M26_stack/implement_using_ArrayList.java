import java.util.ArrayList;
public class implement_using_ArrayList{
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //check the operation of the stack isempty(); 

        public static boolean isempty()

        {
            return list.size()==0;
        }

        // push

        public static void push(int data)
        {
            list.add(data);
        }

        // pop

        public static int pop()
        {
            if(isempty())
            {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        } 

        // peek

        public static int peek()
        {
            if(isempty())
            {
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }

    }

    public static void main(String args[])
    {
        // stack s=new stack();
        // s.push(1); 
        // s.push(2);
        // s.push(3);
        // while(!s.isempty())
        // {
        //      System.out.println(s.peek());
        //      s.pop();
        // }

        // we use both the way to call the function

        stack.push(1);
        stack.push(2);
        stack.push(3);
        while(!stack.isempty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}

// output
// 3
// 2
// 1