public class lab4_01
{
    String s = "Instance Variable";
    void view()
    {
        String s = "Local Variable";
        System.out.println("s= "+s);
        System.out.println("this s= "+this.s);
    }
    public static void main(String[] args) {
        lab4_01 t = new lab4_01();
        t.view();
    }
}