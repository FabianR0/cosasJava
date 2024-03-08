import java.util.Scanner;
public class CondicionalCompuesta2 {
 public static void main(String[] ar) {
 Scanner teclado=new Scanner(System.in);
 int num1;
 System.out.print("Ingresar un numero de 2  digitos:"); 
num1=teclado.nextInt();
 int suma;
 float promedio;
 suma=num1 % 100;
 promedio = suma/3;
 //System.out.println(suma);
    if (num1 >=10 && num1<=99) {
        System.out.print(" tienes dos digitos");
    }else if ( num1<=10){
        System.out.print("tiene un digito");
        }else{
            System.out.print("tiene mas de uno o  dos digitos");
        }
    }
}