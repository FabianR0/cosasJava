 
import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class horasExtras{
  public static void main(String[] args) {
    Scanner teclado= new Scanner (System.in);
    
    System.out.println("Este programa conocer el precio de horas extras trabajada");
    
    double valor_hora;
    double numero_horas;
    double horas_extras;
    double valor_hora_extra;
    double recargo;
    
    
    System.out.println("Didite elvalor de la hora trabajada:");
    valor_hora=teclado.nextDouble();
    
    System.out.println("digite el numero de horas trbajadas:");
    numero_horas=teclado.nextDouble();
   
     valor_hora_extra=(valor_hora/100)*35;
     recargo=valor_hora_extra*horas_extras;
     
    System.out.println("Estas son sus horas de trabajo co recargo por horas extras:");
    System.out.println(recargo);
  }
}