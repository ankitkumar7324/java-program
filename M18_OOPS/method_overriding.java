public class method_overriding {
     public static void main(String args[])
     {
         deer d=new deer();
         d.eat();
     }    
}
class animal{
    void eat(){
        System.out.println("eats everything");
    }
}
class deer extends animal{
    void eat(){
        System.out.println("eats grass");
    }
}