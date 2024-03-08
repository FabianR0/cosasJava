 
import java.util.Scanner;
public class SumaProductoNumeros {

public static void main(String[] ar) {
 System.out.println("Programa para sacar suma, producto, resta y division de 2 valores.");
 Scanner teclado=new Scanner(System.in); // lectura por teclado
 int num1,num2,suma,producto,resta,division,potencia,potencia2;
 System.out.print("Ingrese primer valor:");
 num1=teclado.nextInt();
 System.out.print("Ingrese segundo valor");
 num2=teclado.nextInt();
 suma=num1 + num2;
 producto=num1 * num2;
 resta=num1-num2;
 division=num1/num2;
 potencia=num1*num1;
 potencia2=num2*num2;
 System.out.print("La suma de los dos valores es:");
 System.out.println(suma);
 System.out.print("El producto de los dos valores es:");
 System.out.println(producto);
 System.out.print("La resta de los dos valores es:");
 System.out.println(resta);
 System.out.print("la division de los dos valores es:");
 System.out.println(division);
  System.out.print("la potencia del num1 el valor es:");
 System.out.println(potencia);
  System.out.print("la potencia del num2 el valor es:");
 System.out.println(potencia2);
 }
}