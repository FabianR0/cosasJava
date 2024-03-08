import java.util.Scanner;
public class SumaProductoNumeros {

public static void main(String[] ar) {
 System.out.println("Programa para sacar suma, producto, resta y division de 2 valores.");
 Scanner teclado=new Scanner(System.in); // lectura por teclado
 int num1,num2,num3,suma,producto,potencia,potencia2;
 System.out.print("Ingrese #1 valor: ");
 num1=teclado.nextInt();
 System.out.print("Ingrese #2 valor: ");
 num2=teclado.nextInt();
 System.out.print("Ingrese #3 valor: ");
 num3=teclado.nextInt();
 suma=num1 + num2 + num3;
 producto=num1 * num2 * num3;
 int ans = (int) Math.pow(suma,2);
 int ans1 = (int) Math.pow(producto,3);
 int dif = ans - ans1;
 System.out.println("el cuadrado de la suma es:");
 System.out.println(ans);
 System.out.println("El producto de los valores leidos: ");
 System.out.println(producto);
  System.out.println("El cubo del Producto: ");
 System.out.println(ans1);
  System.out.println("La diferencia entre el cuadrado de la suma con respecto al cubo del producto: ");
 System.out.println(dif);
 }
}