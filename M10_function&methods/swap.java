public class swap
{
  public static void swaping(int a,int b)
  {
    // swap
    int temp=a;
    a=b;
    b=temp;
    System.out.println("a = "+a);
    System.out.println("b = "+b);
  }
    public static void main(String args[])
        {
          int a=10;
          int b=5;
          swaping(a,b); 
        // //   swap
        // int temp=a;
        // a=b;
        // b=temp;
        // System.out.println("the value of  a after swapping is = "+a);
        // System.out.println("the value of  b after swapping is = "+b);
        }
}   