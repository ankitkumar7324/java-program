public class inheritance {
    public static void main(String args[])
    {
    //    fish shark=new fish();
    //    shark.eat();
    dog dobby=new dog();
    dobby.eat();
    dobby.legs=4;
    System.out.println(dobby.legs);
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//derived class  //subclass     
// class fish extends Animal{
//     int fins;
//     void swims(){
//         System.out.println("yes fish swims");
//     }
// }
class mammal extends Animal{
    int legs;
}
class dog extends mammal{

    String breed;
}