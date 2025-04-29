package PracticasArrays;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        int[] diasMeses = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número de mes (1-12): ");
        int numeroMes = scanner.nextInt();

        if (numeroMes < 1 || numeroMes > 12) {
            System.out.println("Número de mes inválido. Debe estar entre 1 y 12.");
        } else {
            
            String nombreMes = nombresMeses[numeroMes - 1];
            int dias = diasMeses[numeroMes - 1];
            System.out.println("El mes " + nombreMes + " tiene " + dias + " días.");
        }

        scanner.close();
    }
}