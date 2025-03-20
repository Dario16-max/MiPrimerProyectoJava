
import java.util.Scanner;
public class practicass7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingresa un numero entero positivo");
        int num = leer.nextInt();
        if (num >= 0 && num <= 9){System.out.println(" el numero " + num +  " es de una sola cifra ");}
        else  if (num >= 10 && num <= 99){System.out.println(" el numero " + num + " es de dos cifras ");}
        else if (num >= 100 && num <= 999){System.out.println(" el numero " + num + " es de tres cifras ");}
        else {System.out.println(" error, el numero " + num + " no esta permitido");}
        leer.close();
    }
}
