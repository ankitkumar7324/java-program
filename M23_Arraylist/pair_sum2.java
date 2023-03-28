import java.util.ArrayList;
public class pair_sum2 {

    // find if any pair in a sorted & rotated arraylist has a target sum

    // 2 pointer approach
    public static boolean pairsum2(ArrayList<Integer> list,int target)
    {
        int n=list.size();
        int bp=-1;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>list.get(i+1))
            {
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp)
        {
           if(list.get(lp)+list.get(rp)==target)
           {
            return true;
           }
           if(list.get(lp)+list.get(rp)<target)
           {
            lp=(lp+1)%n;
           }
           else
           {
            rp=(n+rp-1)%n;
           }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        // list 11 15 6 8 9 10   target 16
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairsum2(list,target));
    }
}
