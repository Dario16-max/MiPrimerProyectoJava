import java.util.Scanner;
public class practicass2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    System.out.println("ingrese tres notas");
    double nota1 = leer.nextDouble();
    double nota2 = leer.nextDouble();
    double nota3 = leer.nextDouble();
    double prom = (nota1 + nota2 + nota3) / 3;
    System.out.println("el promedio de las notas es " + prom);

    if (prom >= 7){
System.out.println("el estudiante fue aprobado");}
else { System.out.println("el estudiante reprobo");
    }
    leer.close();
    }
}
