public class nqueen_print_1sol_only {
    
    public static boolean issafe(char board[][],int row,int col)
    {
        // vertical up
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }
        
        // left diagonal
        for(int i=row-1, j=col-1;i>=0 && j>=0; i-- ,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            
        }
        
        // right diagonal
        for(int i=row-1 , j=col+1;i>=0 && j<board.length;i-- , j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }

        }
        return true;
    }
    public static boolean nqueen(char board[][],int row)
    {
        // base case
        if(row==board.length)
        {
            // printboard(board);
            // count++;
            return true;
        }
        // column case
        for(int j=0;j<board.length;j++)
        {
            if(issafe(board,row,j))
            {
            board[row][j]='Q';
            if(nqueen(board, row+1))
            {
                return true;
            }
            board[row][j]='x';
            }
        }
        return false;
    }
    public static void printboard(char board[][])
    {
        System.out.println("-------chess board------");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
               System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count =0;
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        // initialize
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='x';
            }
        }
        
        // System.out.println("the total number of ways to solve nqueen = "+count);
        if(nqueen(board,0))
        {
            System.out.println("solution is posiible");
            printboard(board);
        }
        else{
            System.out.println("solution is not possible");
        }



    }
}

