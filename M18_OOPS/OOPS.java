public class OOPS{
    public static void main(String args[]){
        Pen p1=new Pen(); // craeted a pen object called p1 
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.settip(8);
        System.out.println(p1.gettip());
        p1.setcolor("yellow");
        System.out.println(p1.getcolor());
    }
    // public static void main(String args[]){
    //     Pen p1=new Pen(); // craeted a pen object called p1 
    //     p1.setcolor("blue");
    //     System.out.println(p1.color);
    //     p1.settip(8);
    //     System.out.println(p1.tip);
    //     p1.color="yellow";
    //     System.out.println(p1.color);
    // }

}
// class Pen{
//     String color;
//     int tip;
//     void setcolor(String newcolor){
//         color=newcolor;
//     }
//     void settip(int newtip){
//         tip=newtip;
//     }
// }
class Pen{
    private int tip;
    private String color;
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void setcolor(String newcolor){
        this.color=newcolor;
    }
    void settip(int newtip){
        this.tip=newtip;
    }
}
