
import java.io.*;
public class lab4_02_a
{
    public static void main(String[] args) throws IOException 
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter your Age :");
        String name = dis.readLine();
        System.out.print(name);
    }
}
