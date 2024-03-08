import java.util.Scanner;
public class CondicionalCompuesta2 {
 public static void main(String[] ar) {
 Scanner teclado=new Scanner(System.in);
 int num1,num2,num3;
 System.out.print("Ingrese #1:"); 
 num1=teclado.nextInt();
 System.out.print("Ingrese #2:"); 
 num2=teclado.nextInt();
  System.out.print("Ingrese #3:"); 
 num3=teclado.nextInt();

    if (num1 > num2 && num1 > num3) {
        System.out.print("#1 es el mayor :"+num1);
    }else if (num2>num1 && num2>num3){
        System.out.print("#2 es el mayor :"+num2);
        } else {
            System.out.print("#3 es el mayor :"+num3);
        }
    }
}