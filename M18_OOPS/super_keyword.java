public class super_keyword {
    public static void main(String[] args) {
        horse h1=new horse();
    }    
}

class animal{
    animal(){
        System.out.println("animal constructor is called");
    }
}
class horse extends animal{
    horse(){
        super();
        System.out.println("horse constructor is called");
    }
}