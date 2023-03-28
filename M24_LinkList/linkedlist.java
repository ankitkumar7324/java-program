public class linkedlist {
    
        public static class Node
        {
            int data;
            Node next;
            public Node(int data)
            {
                this.data=data;
                this.next=null;
            }
        }
            public static Node head;
            public static Node tail;
            // to get the size of the linkedlist 
            public static int size;

            public void addFirst(int data)
            {
                size++;
                // step1== create new node
                Node newnode=new Node(data);
                if(head==null)
                {
                    head=tail=newnode;
                    return;
                }

                // step2 == newnode next=head
                newnode.next = head;  //link

                // step3 == head=newnode
                head=newnode;
            }

            public  void addLast(int data)
            {
                size++;
                Node newnode=new Node(data);
                if(head==null)
                {
                    head=tail=newnode;
                    return;
                }
                tail.next=newnode;
                tail=newnode;
            }

            public void print()
            {
                if(head==null)
                {
                    System.out.println("linkedlist is empty");
                    return;
                }
                Node temp=head;
                while(temp!=null)
                {
                    System.out.print(temp.data+ "->");
                    temp=temp.next;
                }
                System.out.println("null");
            }

            public void add(int idx,int data)
            {
                if(idx==0)
                {
                   addFirst(data);
                   return;  
                }
                size++;
                Node newnode=new Node(data);
                Node temp=head;
                int i=0;
                while(i<idx-1)
                {
                    temp=temp.next;
                    i++;
                }
                newnode.next=temp.next;
                temp.next=newnode;

            }

            public int removeHead(){
                if(size==0)
                {
                    System.out.println("linkedlist is empty");
    
                    return Integer.MIN_VALUE;
                }
                else if(size==1)
                {
                    int val=head.data;
                    head=tail=null;
                    size=0;
                    return val;
                    
                }
                int val=head.data;
                head=head.next;
                size--;
                return val;
            }

            public int removeTail()
            {
                if(size==0)
                {
                    System.out.println("linkedlist is empty");
                    return Integer.MIN_VALUE;
                }
                else if(size==1)
                {
                    int val=head.data;
                    head=tail=null;
                    size=0;
                    return val;
                }

                Node prev=head;
                for(int i=0;i<size-2;i++)
                {
                    prev=prev.next;
                     
                }
                int val=prev.next.data;
                prev.next=null;
                tail=prev;
                size--;
                return val;
            }


            public int itrsearch(int key)
            {
                Node temp=head;
                int i=0;
                while(temp!=null)
                {
                    if(temp.data==key)
                    {
                        return i;
                    }
                    temp=temp.next;
                    i++;
                }
                return -1;
            }
            
            public int helper(Node head,int key)
            {
                if(head==null)
                {
                    return -1;
                }
                if(head.data==key)
                {
                    return 0;
                }
                int idx=helper(head.next,key);
                if(idx==-1)
                {
                    return -1;
                }

                return idx+1;
            }

            public int recsearch(int key)
            {
                return helper(head,key);
            }


            public void reverse()
            {
                Node prev=null;
                Node curr=tail=head;
                Node next;

                while(curr != null)
                {
                    next = curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=next;
                }

                head=prev;

            }

            public void deleteNthfromEnd(int n)
            {
                // calculate size
                int sz=0;
                Node temp=head;
                while(temp !=null)
                {
                    temp=temp.next;
                    sz++;
                }

                if(n==sz)
                {
                    head=head.next;  //remove first 
                    return;
                }

                // sz-n

                int i=1;
                int iToFind=sz-n;
                Node prev=head;
                while(i<iToFind)
                {
                    prev=prev.next;
                    i++;
                }

                prev.next=prev.next.next;
                return;
            }
        
        public static void main(String[] args) {
            linkedlist ll=new linkedlist();
            ll.print();
            ll.addFirst(1);
            ll.print();
            ll.addFirst(2);
            ll.print();
            
            ll.addLast(3);
            ll.print();
            ll.addLast(4);
            ll.add(2,5);
            
            ll.print();
            ll.removeHead();
            ll.print();
            
            ll.removeTail();
            ll.print();
            ll.reverse();
            ll.print();
            System.out.println("the size of the linked list is -> "+ll.size);
            System.out.println(ll.itrsearch(1));
            System.out.println(ll.recsearch(3));
            ll.deleteNthfromEnd(2);
            ll.print();
            

        }
        
}
    
