public class Kth_level_of_tree {
    static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void Klevel(Node root , int level , int K)
    {
        if(root == null)
        {
            return;
        }
        if(level == K)
        {
            System.out.print(root.data+" ");
            return;
        }

        Klevel(root.left,level+1,K);
        Klevel(root.right,level+1,K);
    }

    public static void main(String[] args) {
        /*
                   tree
                      1
                   /    \
                  2      3
                 / \    / \
                4   5  6   7


    */     
    
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    
    Klevel(root,1,3);
    
    }

}

// output 4 5 6 7
