import java.util.Scanner;
public class Main {
    public static void main(String[] args) 
	{
	Scanner teclado = new Scanner( System.in );
		 int numero ;
		 int aux ;
		 int inverso ;
		 int cifrainversa =0 ;
		 System.out.print("Ingrese un numero:");
         numero=teclado.nextInt();
         aux = numero;
         for(int i =0; i < aux ; i++){
             cifrainversa=aux+ cifrainversa;
             System.out.println(cifrainversa);
         }
	inverso=cifrainversa;
	System.out.print("original:" +numero);
	System.out.print("invertido:"+inverso);
	if( numero == inverso){
	    System.out.print("el numero es palindrome:");
	}else {
	   System.out.print("el numero no es palindrome:"); 
	}
}
}
