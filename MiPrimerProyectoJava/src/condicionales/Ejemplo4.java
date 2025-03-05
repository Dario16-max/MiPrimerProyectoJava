package condicionales;
import java.util.Scanner;
public class Ejemplo4 {

    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner leer = new Scanner(System.in);
        int numero = leer.nextInt();
        int factorial = 1;
        int i= 1;
        while (i<=numero){
        factorial *= i;
        i++;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
        leer.close();
    }
}
