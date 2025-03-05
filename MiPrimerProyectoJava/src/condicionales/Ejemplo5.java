package condicionales;
import java.util.Scanner;
public class Ejemplo5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = leer.nextInt();
        for (int contador = 1; contador <=10 ;contador++){
            System.out.println("la tabla demultiplicar del numero "+numero+"es "+
            numero+"*"+contador+"="+contador*numero);
        }
        leer.close();
    }
}
