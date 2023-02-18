import java.util.ArrayList;



public class declaration {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        // ArrayList<Integer> list2=new ArrayList<>();
        // ArrayList<Integer> list3=new ArrayList<>();

        // add function operation
        // t.c == o(1)
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list1.add(2, 12); // t.c==o(n)

        System.out.println(list1);

        // get function operation
        // t.c == o(1)
        int element = list1.get(3);
        System.out.println(element);

        // remove function operation
        // t.c ==o(n)
        list1.remove(3);
        System.out.println(list1);

        // set element function operation
        // t.c == o(n)

        list1.set(2, 10);
        System.out.println(list1);
        // contain function operation
        // t.c == o(n)
        System.out.println(list1.contains(4));
        System.out.println(list1.contains(10));
    }

    
}
