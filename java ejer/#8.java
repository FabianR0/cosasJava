import java.util.Scanner;
import java.util.*;
public class SoNumeros {

public static void main(String[] ar) {
 System.out.println("Programa para sacar promedio.");
 Scanner teclado=new Scanner(System.in); // lectura por teclado
 int num1,num2,num3,producto,codigo;
 double suma;
 String letra;
 System.out.print("Ingrese el codigo: ");
 codigo=teclado.nextInt();
 System.out.print("Ingrese el nombre del estudiante: ");
 letra = teclado.next();
 System.out.print("Ingrese #1 valor: ");
 num1=teclado.nextInt();
 System.out.print("Ingrese #2 valor: ");
 num2=teclado.nextInt();
 System.out.print("Ingrese #3 valor: ");
 num3=teclado.nextInt();
 suma=(num1 + num2 + num3)/3;
 producto=num1 * num2 * num3;
 System.out.println("-----Consulta del estudiante fue: ------");
 System.out.print("el # del estudiante es: ");
 System.out.println(codigo);
 System.out.print("el nombre del estudiante es: ");
 System.out.println(letra);
 System.out.print("el promedio es: ");
 System.out.println(suma);
}
}