package MiPrimerProyectoJava;
import java.util.Scanner;
public class practicass5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingresa dos numeros distintos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        if (num1>num2){System.out.println("el primer numero es el mayor: " + num1);}
        else {System.out.println("el segundo numero es el mayor: " + num2);}
    leer.close();
    }
}