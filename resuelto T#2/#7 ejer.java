import java.util.Scanner;
public class Condicional {
 public static void main(String[] ar) {
 Scanner teclado=new Scanner(System.in);
 int num1,num2;
 System.out.println("Ingrese la cantidad de preguntas que contesto correctamente:"); 
 num2=teclado.nextInt();
 System.out.println("Ingrese la cantidad total de preguntas que se le realizaron:"); 
num1=teclado.nextInt();


float porcentaje=100*num2 /num1;
 
    if ( porcentaje>=90) {
        System.out.println(" Nivel maximo");
        }else if (porcentaje>=75 && porcentaje<90){
            System.out.println("Nivel_medio");
            }else if (porcentaje>=50 && porcentaje<75){
            System.out.println(" Nivel_regular");
                }else if(porcentaje<50){
                System.out.println("Fuera de nivel");
        }
    System.out.println("Valor de porcentaje: "+ porcentaje);
    }
}