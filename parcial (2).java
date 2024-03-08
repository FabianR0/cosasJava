import java.util.Scanner; 
import java.lang.Math;
import java.lang.Character;
import java.lang.Boolean;

//juan camilo nieto bejarano 1004775552
public class parcial_f{ 

    public static void main(String[] args) { 
        System.out.println("f) realice un programa, que ingrese una cantidad de segundos y muestre equivalentes"); 
        Scanner teclado=new Scanner(System.in); // lectura por teclado 
        int segundos,minutos=0,horas=0,dias=0,semanas=0,segundoss=0;
        System.out.print("\nIngrese un numero de segundos:"); 
        segundos=teclado.nextInt(); 
        semanas=segundos/604800;
        dias=(segundos-(semanas*604800))/86400;
        horas=(segundos-((semanas*604800)+(dias*86400)))/3600;
        minutos=(segundos-((semanas*604800)+(dias*86400)+(horas * 3600)))/60;
        segundoss=(segundos - ((horas * 3600)+ (minutos*60)+(dias*86400)+(semanas*604800)));
        System.out.print("\nLos "+segundos+" equivalen a "+semanas+" semanas "+dias+" dias "+horas+" h "+minutos+" m "+segundoss+" s "); 
        
        } 
    
}

public class parcial_g{ 

    public static void main(String[] args) { 
        System.out.println("g) una persona invierte en un banco, le ofrecen 2% de interes mensual, cual sera la cantidad al cabo de un ano, y si"); 
        Scanner teclado=new Scanner(System.in); // lectura por teclado 
        double deposito, interes=1.02;
        System.out.print("\nIngrese cantidad a invertir:"); 
        deposito=teclado.nextDouble(); 
        for(int i=0;i<12;i++){
            deposito= deposito*interes;
        }
        System.out.print("\nLa cantidad al cabo de un ano es:"+deposito); 
        } 
    
}