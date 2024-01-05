import java.util.HashMap;

public class hashMap_operation {
    public static void main(String[] args) {
        // create
        HashMap<String,Integer> hm = new HashMap<>();
        // insert 0(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        // print
        System.out.println(hm);
        
        // get 0(1)
        
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));
        
        // ContainsKey 0(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));
        
        // remove - 0(1)
        System.out.println(hm.remove("India"));
        System.out.println(hm);
        System.out.println(hm.remove("Indonesia"));
        System.out.println(hm);

        // size

        System.out.println(hm.size());
        
        // isEmpty
        
        System.out.println(hm.isEmpty());
        
        // clear
        hm.clear();
        System.out.println(hm);



         



    }
}

// output
// {China=150, US=50, India=100}
// 100
// null
// true
// false
// 100
// {China=150, US=50}
// null
// {China=150, US=50}
// 2
// false
// {}