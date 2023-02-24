public class linkedlist {
    
        public static class node
        {
            int data;
            node next;
            public node(int data)
            {
                this.data=data;
                this.next=null;
            }
            public static node head;
            public static node tail;

            public void addFirst(int data)
            {
                // step1== create new node
                node newnode=new node(data);
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
                node newnode=new node(data);
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
                node temp=head;
                while(temp!=null)
                {
                    System.out.print(temp.data+ "->");
                    temp=temp.next;
                }
                System.out.println("null");
            }
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
            ll.print();

        }
        
}
    
