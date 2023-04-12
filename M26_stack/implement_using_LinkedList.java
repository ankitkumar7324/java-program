
import java.util.*;
public class implement_using_LinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class stack
    {
        public static Node head = null;

        //  isempty operation to check whether the linkedlist is empty or not

        public static boolean isempty()
        {
            return head==null;
        }

        // push operation

        public static void push(int data)
        {
            Node newnode = new Node(data);
            if(isempty())
            {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        // pop operation

        public static int pop()
        {
            if(isempty())
            {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek operation

        public static int peek()
        {
            if(isempty())
            {
                return -1;
            }
            int top = head.data;
            return top;
        }
    }

    public static void main(String args[])
    {
        stack s =new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isempty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
