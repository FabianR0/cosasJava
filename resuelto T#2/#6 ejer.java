import java.util.Scanner;
public class CondicionalCompuesta2 {
 public static void main(String[] ar) {
 Scanner teclado=new Scanner(System.in);
 int num1;
 System.out.print("Ingresar un # de 3 digitos:"); 
num1=teclado.nextInt();

    if (num1 >=100 && num1<=999) {
        System.out.print(" tiene 3 digitos");
    }else if (num1 >=10 && num1<=99){
            System.out.print(" tiene 2 digitos");
        }else if (num1<=10){
            System.out.print("tiene 1 digito");
        }else{
            System.out.print("ERROR :tiene mas de tres digitos");
        }
    }
}