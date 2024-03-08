import java.util.Scanner;
public class CondicionalCompuesta2 {
 public static void main(String[] ar) {
 Scanner teclado=new Scanner(System.in);
 int num1;
 System.out.print("Ingrese #1:"); 
 num1=teclado.nextInt();


    if (num1 >=1) {
        System.out.print("el #"+num1+" es positivo");
    }else if (num1 == 0){
        System.out.print("el #"+num1+" es nulo");
        } else if(num1 < 0 ) {
            System.out.print("el #"+num1+" es negativo");
        }
    }
}