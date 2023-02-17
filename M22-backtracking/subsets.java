public class subsets {
    public static void findsubsets(String s,String ans,int i)
    {
        // base case
        if(i==s.length()){
         if(ans.length()==0)
         {
            System.out.println("null");
         }
         else{
            System.out.println(ans);
         }
         return;
        }
        // recursion
        // yes choice
        findsubsets(s, ans+s.charAt(i), i+1);
        // no choice
        findsubsets(s,ans,i+1);

    }
      public static void main(String[] args) {
        String s="abc";
        findsubsets(s, "", 0);
      }    
}
