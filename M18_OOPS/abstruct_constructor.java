public class abstruct_constructor {
    public static void main(String args[])
    {
       mustang m=new mustang();
    //    constructor hierarchy called (animal -> horse -> mustang)
    }
}
class animal{
    String color;
    animal(){
        System.out.println("animal constructor called");
    }
}
class horse extends animal{
    horse(){
        System.out.println("horse contructor is called");
    }
}
class mustang extends horse{
    mustang(){
        System.out.println("mustang constructor is called");
    }
}
