package condicionales;
import java.util.Scanner;
public class Ejemplo1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero ");
        int num1 = leer.nextInt ();
        System.out.println("ingrese un numero");
        int num2 = leer.nextInt();
        System.out.println("ingrese nummero ");
        int num3 = leer.nextInt();

        if( num1 > num2 && num2 > num3){
        System.out.println("el numero mayor es "+num1);
        }else if (num2 > num1 && num1>num3){
            System.out.println("el numero mayor es "+num2);
        }else {
        System.out.println("el numero mayor es "+ num3);
        }
        leer.close();
    }
}