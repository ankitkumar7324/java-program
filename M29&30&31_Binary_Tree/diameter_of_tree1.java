public class diameter_of_tree1 {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int diameter(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int leftdiam = diameter(root.left);
        int leftht = height(root.left);
        int rightdiam = diameter(root.right);
        int rightht = height(root.right);

        int selfdiam = leftht+rightht+1;

        return Math.max(selfdiam , Math.max(leftdiam , rightdiam));
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
    
    System.out.println(diameter(root));
    
    }
         
}

