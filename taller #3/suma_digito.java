import java.util.Scanner;
public class Main{

    public static void main(String[] args){
 
      Scanner sc = new Scanner( System.in );
       int numero, invertido = 0,resto;
       int rr=0;
       int con=0;
      System.out.println( "Introduce un numero: " );
 
      numero = sc.nextInt();
      
     while(numero>0){
         rr= rr +numero%10;
         numero =numero/10;
         con++;
     }
     System.out.println( "la cantidad de # ingresado es: "+ con );
     System.out.println( "suma de los digitos es: "+rr );
     
     //------------------------------------------------------ 
    if (rr> 9){
      while( rr > 0 ) {
         resto = rr % 10;
         invertido = invertido * 10 + resto;
         rr /= 10;
      }
      System.out.println( " invertido es: " + invertido );
    }else{
          System.out.println( "Digite un numero mayor que 9");
      }
      
     
   }

}