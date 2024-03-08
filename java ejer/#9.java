import java.util.Scanner;
import java.util.*;
public class SoNumeros {

public static void main(String[] ar) {
 System.out.println("Programa para sacar promedio.");
 Scanner teclado=new Scanner(System.in); // lectura por teclado
 int num1;
 double peso =   0.00023,cant;
double dolar =4.396,cant1;
 System.out.print("Ingrese #1 % pesos colombiano: ");
 num1=teclado.nextInt();
 
 cant=num1*peso;
 cant1=num1/dolar;
 System.out.println("----CONVERSION A DOLAR-----");
 System.out.println("el valor en dolar es: ");
  System.out.println(cant);
 

}
}