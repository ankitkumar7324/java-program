public class abstruct{
    public static void main(String args[])
    {
        chicken c1=new chicken();
        c1.eat();
        c1.walk();

        horse h1=new horse();
        h1.eat();
        h1.walk();
        // h1.changecolor();
System.out.println(h1.color); 
    }
}
abstract class Animal{
    String color;
    Animal(){
         color="brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk(); 
}
class horse extends Animal{
    void changecolor(){
        color="yellow";
    }
    void walk(){
        System.out.println("horse walks on 4 legs");
    }
}
class chicken extends Animal{
    void walk(){
        System.out.println("chicken walks on 2 legs");
    }
}