package Matrices;

public class matri9 {
    public static void main(String[] args) {
        int[][] calificaciones = {
            {85, 90, 78, 92}, 
            {88, 76, 95, 89}, 
            {90, 88, 82, 91}  
        };

        for (int i = 0; i < calificaciones.length; i++) {
            int suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            System.out.println("Promedio del estudiante " + (i + 1) + ": " + (suma / calificaciones[i].length));
        }
    }
}