public class interfaces {
   public static void main(String srg[])    
   {
       queen q1=new queen();
       q1.moves();
       king k1=new king();
       k1.moves();
   }
}
interface chessplayes{
    void moves();
}
class queen implements chessplayes{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (in all 4 directions)");
    } 
}
class rook implements chessplayes{
    public void moves(){
        System.out.println("up,down,left,right");
    } 
}
class king implements chessplayes{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (in all 4 directions with only 1 steps)");
    } 
}
