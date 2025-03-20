package MiPrimerProyectoJava;
import java.util.Scanner;
public class practicass4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresar sueldo ");
        double sueldo = leer.nextDouble();
        if (sueldo <= 3000){System.out.println("sueldo suficiente ");}
        else if (sueldo > 3000){System.out.println("debe abonar impuestos");}
    leer.close();
    }
}
