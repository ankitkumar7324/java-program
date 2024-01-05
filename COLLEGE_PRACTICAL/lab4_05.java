import java.io.*;
public class lab4_05 
{
    public static void main(String[] args) throws IOException 
    {
        char vowel;
        System.out.println("enter the character in lower case");
        vowel = (char)System.in.read();
        switch (vowel) 
        {
            case 'a':
                System.out.println("a is vowel");
                break;
            case 'e':
                System.out.println("e is vowel");
                break;
            case 'i':
                System.out.println("i is vowel");
                break;
            case 'o':
                System.out.println("o is vowel");
                break;
            case 'u':
                System.out.println("u is vowel");
                break;
        
            default:
                System.out.println("not found");
                break;
        }
        
    }
}
