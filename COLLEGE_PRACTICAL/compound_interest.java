import java.lang.Math;
public class compound_interest {
     public static void main(String[] args) {
        double p = 1000;
        double r = 10;
        double n = 4;
        double a;
        a= p * Math.pow((1+(r/100)),n);
        double ci = a-p;
        System.out.println("the compound interest is" + ci);

     }   
}
