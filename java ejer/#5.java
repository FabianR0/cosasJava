import java.util.Scanner;

public class Articulo{
    public static void main (String args []){
        Scanner teclado=new Scanner (System.in);
        
        int referencia;
        String  nombre;
        int unidades_disponibles;
        double valor;
        double iva;
        double valor_con_iva;

        System.out.print("ingrese la referencia del producto:");
        referencia=teclado.nextInt();
        
        System.out.print("ingrese el nombre el producto:");
        nombre=teclado.next();
        
        System.out.print("valor unitario del producto:$");
        valor=teclado.nextDouble();
        
        System.out.print("cuantos productos hay diponibles:");
        unidades_disponibles=teclado.nextInt();
        
       iva=(valor/100)*19;
       valor_con_iva=valor+iva;
       
       System.out.print("Valor del producto con iva $");
       System.out.println(valor_con_iva);
    }
}