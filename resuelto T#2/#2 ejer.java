import java.util.Scanner;
public class CondicionalCompuesta2 {
 public static void main(String[] ar) {
 Scanner teclado=new Scanner(System.in);
 int num1,num2,num3;
  System.out.print("NOTAS DEL 1 AL 10:");
 System.out.print("Ingrese #1 nota:"); 
 num1=teclado.nextInt();
 System.out.print("Ingrese #2 nota:"); 
 num2=teclado.nextInt();
  System.out.print("Ingrese #3 nota:"); 
 num3=teclado.nextInt();

 float promedio;

    if (promedio >= 7) {
        System.out.print(" Gana la Materia");
    }else{
        System.out.print("reprobo");
        }
    }
}