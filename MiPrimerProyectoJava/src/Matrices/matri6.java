package Matrices;

public class matri6 {
    public static void main(String[] args) {
        // Declarar e inicializar la matriz precios
        double[][] precios = {
            {10.5, 20.0, 30.0},
            {15.0, 25.5, 35.5},
            {12.0, 22.0, 32.0}
        };

        for (int i = 0; i < precios.length; i++) {
            double suma = 0;
            for (int j = 0; j < precios[i].length; j++) {
                suma += precios[i][j];
            }
            System.out.println("El promedio de precios del producto " + (i + 1) + " es: " + (suma / precios[i].length));
        }
    }
}