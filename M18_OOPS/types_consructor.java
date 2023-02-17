public class types_consructor {
    public static void main(String args[])
    {
        Student s1=new Student();
        Student s2=new Student("ankit");
        Student s3=new Student(12);
    }
}
    class Student{
        String name;
        int roll;
        Student(){
            System.out.println("this is a constructor");
        }
        Student(String name){
            this.name=name;
        }
        Student(int roll){
            this.roll=roll;
        }

    }

