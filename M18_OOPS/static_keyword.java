public class static_keyword {
    
public static void main(String[] args) {
    student s1=new student();
    s1.schoolname="model school";

    student s2=new student();
    System.out.println(s2.schoolname);

    student s3=new student();
    s3.schoolname="DAV";
    // System.out.println(s3.schoolname);
}
}

class student{
    String name;
    int roll;

    static String schoolname;

    void getname(String name)
    {
        this.name=name;
    }
    
    String getname(){
        return name;
    }
}
