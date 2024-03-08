import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int i;
        int suma = 0;
        int numero;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        numero=teclado.nextInt();
        
        for (i = 1; i < numero; i++) {                            
            if (numero % i== 0) {
                suma = suma + i;   // acumulador 
            }
        }
        if (suma == numero) {          
            System.out.println(" Numero Perfecto");
        } else {
            System.out.println("No es  un numero perfecto");

        }
    }
}