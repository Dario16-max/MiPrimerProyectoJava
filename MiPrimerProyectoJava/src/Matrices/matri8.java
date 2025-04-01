package Matrices;

public class matri8 {

    public static void main(String[] args) {
        int[][] imagenGris = {
            {100, 150, 200},
            {50, 75, 125},
            {0, 255, 180}
        };
        for (int i = 0; i < imagenGris.length; i++) {
            for (int j = 0; j < imagenGris[i].length; j++) {
                imagenGris[i][j] = 255 - imagenGris[i][j]; 
            }
        }
        System.out.println("Matriz invertida:");
        for (int i = 0; i < imagenGris.length; i++) {
            for (int j = 0; j < imagenGris[i].length; j++) {
                System.out.print(imagenGris[i][j] + " ");
            }
            System.out.println();
        }
    }
}