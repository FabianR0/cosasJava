import java.util.Scanner;
public class CondicionesCompuestas3 {
 public static void main(String[] ar) {
 Scanner teclado=new Scanner(System.in);
 int dia,mes,year;
 System.out.print("Ingrese nro de dia:");
 dia=teclado.nextInt();
 System.out.print("Ingrese nro de mes:");
 mes=teclado.nextInt();
 System.out.print("Ingrese nro de year:");
 year=teclado.nextInt();
 if (mes==1) {
 System.out.println("La fecha ingresada corresponde a Enero -- dia de los reyes magos.");
 } else if(mes==2){
     System.out.println("La fecha ingresada corresponde a Febrero");
 } else if(mes==3){
     System.out.println("La fecha ingresada corresponde a Marzo mes de la mujer");
 } else if(mes==4){
      System.out.println("La fecha ingresada corresponde a Abril mes de semana santa");
 } else if(mes==5){
      System.out.println("La fecha ingresada corresponde a Mayo mes de la madre");
 } else if(mes==6){
      System.out.println("La fecha ingresada corresponde a Junio mes de la mujer");
 } else if(mes==7){
      System.out.println("La fecha ingresada corresponde a Julio mes de la independecia de Colombia");
 } else if(mes==8){
      System.out.println("La fecha ingresada corresponde a Agosto mes de la cometa");
 } else if(mes==9){
      System.out.println("La fecha ingresada corresponde a Septiempre mes del amor y la amistad");
 } else if(mes==10){
      System.out.println("La fecha ingresada corresponde a Octubre mes de la bruja");
 } else if(mes==11){
      System.out.println("La fecha ingresada corresponde a Noviembre mes de los fieles difuntos");
 } else if(mes==12){
      System.out.println("La fecha ingresada corresponde a Diciembre mes de navidad");
 }
System.out.println("La fecha que ingreso fue: "+ dia+ "/"+mes+"/"+year);
 } 
}