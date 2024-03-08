 
import java.util.Scanner;
public class Main
{
    public static void main(String args[]) 
    {
        final double PI = 3.14;
 
        System.out.println("ingrese el  radio : ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double Area = PI*(r*r);
        System.out.println("Area is : "+Area);
        double Circumferencia = 2*(PI*r);
        System.out.println("Circumferencia es : "+Circumferencia);
    }
}