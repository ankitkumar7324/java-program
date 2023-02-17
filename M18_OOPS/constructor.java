public class constructor {
    public static void main(String args[]){
    //  Student s1=new Student("ankit");
    //  System.out.println(s1.name);
    Student s1=new Student();
    }
}
class Student{
    String name;
    int roll;
    // Student(String name){   //this is a constructor
    //   this.name=name;
    // }
    Student()
    {
        System.out.println("this is a constructor");
    }
}
