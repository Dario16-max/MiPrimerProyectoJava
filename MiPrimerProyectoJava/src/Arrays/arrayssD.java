
package Arrays;

import java.util.Scanner; // Mover el import fuera de la clase

public class arrayssD {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un número: ");
            numeros[i] = leer.nextInt();
            suma += numeros[i]; 
        }

        double promedio = suma / (double) numeros.length;
        System.out.println("El promedio es: " + promedio);

        leer.close();
    }
}