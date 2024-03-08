import java.util.Scanner;
public class CondicionalCompuesta2 {
 public static void main(String[] ar) {
 Scanner teclado=new Scanner(System.in);
 int num1,num2;
 System.out.print("Ingrese primer valor:"); 
 num1=teclado.nextInt();
 System.out.print("Ingrese segundo valor:"); 
 num2=teclado.nextInt();
 int suma;
 int diferencia;
 int producto;
 float divi;
 suma=num1 + num2;
 diferencia = num1 - num2;
 producto = num1 * num2;
 divi = num1/ num2;
if (num1 > num2) {
   System.out.print("La suma de los dos valores es:");
 System.out.println(suma);
 System.out.print("La diferencia de los dos valores es:");
 System.out.println(diferencia); 
 }else{
System.out.print("el producto de los dos valores es:");
 System.out.println(producto);
 System.out.print("La divicision de los dos valores es:");
 System.out.println(divi); 
 }
 
 }
}