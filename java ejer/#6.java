import java.util.Scanner;
import java.lang.Math;


public class trabajador{
    
    public static void main(String[] ar) {
        System.out.println("Programa para calcular el aporte de salud,pension y el neto a pagar");
        Scanner teclado=new Scanner(System.in); // lectura por teclado
        
        String nombre;
        String cargo;
        double sueldo;
        double aporte_salud;
        double aporte_pension;
        
        System.out.println("Ingrese su nombre de usuario:");
        nombre=teclado.next();
        
        System.out.println("ingrese su cargo:");
        cargo=teclado.next();
        
        System.out.println("ingrese su sueldo basico:");
        sueldo=teclado.nextDouble();
        
        aporte_salud=(sueldo/100)*4;
        aporte_pension=(sueldo/100)*3.375;
        
        System.out.println("Este es su aporte a salud: ");
        System.out.println(aporte_salud);
        
        System.out.println("Este es su aporte a pension: ");
        System.out.println(aporte_pension);
        
        
    }
}