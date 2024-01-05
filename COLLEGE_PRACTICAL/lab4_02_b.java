// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.io.*;

public class lab4_02_b {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter your name:");
        String name = reader.readLine();
        System.out.println(name); 
    }
}
