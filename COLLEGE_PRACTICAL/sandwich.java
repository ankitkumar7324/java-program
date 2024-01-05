public class sandwich
{
    public static int maxno(int b,int c,int h)
    {
        
        int count=0;
        while(b>0)
        {
            count++;
            b--;
            if(b==0 || (c==0 && h==0))
            {
                return count;
            }
        

            if(h>0)
            {
                count++;
                h--;
            }
            else if(c>0)
            {
                count++;
                c--;
            }
            
            

        }
           
            
        
        return -1;
    }
    public static void main(String args[])
    {
        int x=maxno(3,7,8);
        System.out.println(x);
        
    }
}