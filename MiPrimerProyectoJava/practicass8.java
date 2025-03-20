package MiPrimerProyectoJava;
import java.util.Scanner;
public class practicass8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese la cantidad de preguntas del test ");
        int preguntas = leer.nextInt();
        System.out.println("ingrese la cantidad de respuestas correctas ");
        int correctas = leer.nextInt();

        double porc = (correctas * 100) / preguntas;
        if (porc >= 90){System.out.println("se encuentra en el Nivel maximo");}
        else if (porc >= 75 && porc < 90){System.out.println("se encuentra en el Nivel medio");}
        else if (porc >= 50 && porc < 75){System.out.println("se encuentra en el Nivel regular");}
        else if (porc < 50){System.out.println("se encuentra Fuera de nivel");}

        leer.close();
    }
}
