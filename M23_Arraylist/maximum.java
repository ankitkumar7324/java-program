import java.util.*;
public class maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(23);
        list.add(31);
        list.add(54);
        list.add(7);

        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            // if(list.get(i)>=max)
            // {
            //     max=list.get(i);
            // }
            max=Math.max(max,list.get(i));
        }
        System.out.println("the maximum element of this list is "+max);
    }
}
