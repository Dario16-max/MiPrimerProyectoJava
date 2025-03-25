
import java.util.Scanner;

public class practicass11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            double nota = leer.nextDouble();

            if (nota >= 7) {
                mayor++;
            } else {
                menor++;
            }
        }

        System.out.println("Cantidad de notas mayores o iguales a 7 son: " + mayor);
        System.out.println("Cantidad de notas menores a 7 son : " + menor);

        leer.close();
    }
}