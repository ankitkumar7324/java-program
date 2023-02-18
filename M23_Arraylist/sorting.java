// import java.util.Collections;
// import java.util.ArrayList;
import java.util.*;
public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(23);
        list.add(31);
        list.add(54);
        list.add(7);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
    
}
