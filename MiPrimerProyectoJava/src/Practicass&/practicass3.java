
import java.util.Scanner;

public class practicass3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
        System.out.println("ingrese un numero positivo de uno o dos dijitos ");
        int num = leer.nextInt();
        if (num <= 9 && num >=0){System.out.println("el numero es de un dijito");}
        else if (num <= 99 && num >=10){System.out.println("el numero es de dos dijitos");}
    leer.close();
    }
}
