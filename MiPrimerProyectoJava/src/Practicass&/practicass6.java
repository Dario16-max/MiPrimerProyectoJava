
import java.util.Scanner;
public class practicass6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingresa un numero entero");
        int num = leer.nextInt();
        if (num > 0){System.out.println("el numero " + num + " es positivo ");}
        else if (num < 0){System.out.println("el numero " + num + " es negativo ");}
        else {System.out.println("el numero " + num + " es nulo ");}
        leer.close();
    }
}
