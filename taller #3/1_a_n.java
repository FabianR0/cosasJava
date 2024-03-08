import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x=0, suma;
        System.out.print("Introduce un numero entero: ");
        n = sc.nextInt();
        System.out.println("\nNumeros del 1 al " + n + ": ");

if(n>1){
    for(int i=0; i<= n;i++){
        suma=x;
        x=i+suma;
    }
}else{
    System.out.println("\n Digite un # mayor del 1 ");
}
    System.out.println("\nLa suma del # del 1 al " + n + " es: "+x);
}
}