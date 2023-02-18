import java.util.*;

public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);

        //  find the size or length of arraylist is
        System.out.println(list.size());

        // print the arraylist
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
}