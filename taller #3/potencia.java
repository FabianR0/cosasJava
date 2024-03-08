 import java.util.Scanner; 
    public class Main {
    public static void main(String[] ar) { 
    Scanner teclado=new Scanner(System.in); 
    
    int bas;
    int pot;
    int rest=1;
    
    
System.out.println("elevacion");
   System.out.println("ingrese un # para la base:");
bas=teclado.nextInt();
  
   System.out.println("ingrese un # para la potencia:");
pot=teclado.nextInt();

for( int i=1; i<=pot ;i++){
    rest=bas*rest;
    
}
   System.out.println("esta es el resultado de la elevacion fue: ");
   System.out.print(rest);
    }
    }