import java.util.Scanner;
class Main {
 
   public static void main( String[] args ) {
      int numero, invertido = 0, resto;
 
      Scanner s = new Scanner( System.in );
      System.out.println( "Introduce un numero: " );
 
      numero = sc.nextInt();
    if (numero> 9){
      while( numero > 0 ) {
         resto = numero % 10;
         invertido = invertido * 10 + resto;
         numero /= 10;
      }
      System.out.println( "El Numero invertido es: " + invertido );
    }else{
          System.out.println( "Digite un numero mayor que 9");
      }
   }
 
}