public class nqueens_print_all_sol {
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
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            
        }
        
        // right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }

        }
        return true;
    }
    public static void nqueen(char board[][],int row)
    {
        // base case
        if(row==board.length)
        {
            printboard(board);
            return;
        }

        // recursion
        for(int j=0;j<board.length;j++)
        {
            if(issafe(board,row,j))
            {
            board[row][j]='Q';
            nqueen(board,row+1);
            board[row][j]='x';
            }
        }
    }
    public static void printboard(char board[][])
    {
        System.out.println("------ chess board  --------");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                board[i][j]='x';
            }
        }
        nqueen(board,0);
    }
    
}
