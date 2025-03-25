
import java.util.Scanner;
public class practicass9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese las tres notas del estudiante");
        double nota1 = leer.nextDouble();
        double nota2 = leer.nextDouble();
        double nota3 = leer.nextDouble();

        double prom = (nota1 + nota2 + nota3) / 3;
        System.out.println("su promedio es de: " + prom);
            if (prom >= 7){System.out.println("estudiante Promocionado ");}
            else if (prom >= 4 && prom < 7 ){System.out.println("estudiante Regular ");}
            else if (prom < 4){System.out.println("estudiante Reprobado ");}
    leer.close();
    }
}
