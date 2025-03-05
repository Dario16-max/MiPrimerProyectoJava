package condicionales;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Seleccione una opcion para hacer una operación:");
        System.out.println("1. Para sumar");
        System.out.println("2. Para restar");
        System.out.println("3. Para multiplicar");
        System.out.println("4. Para dividir");
        int opcion = leer.nextInt();

        if(opcion == 1 || opcion ==2 || opcion ==3) {
        System.out.print("Ingrese el primer número: ");
        int numero1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            
            default:
                System.out.println("Opción no válida.");
                break;
            }
        }
else if (opcion ==4) {
    switch (opcion) {
        case 4:
        System.out.println("no se puede dividir por 0");
        System.out.print("Ingrese el primer número: ");
        int numero1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = leer.nextInt();
        if (numero2 != 0) {
            System.out.println("Resultado: " + (numero1 / numero2));
        } else {
            System.out.println("Error: División por cero");
        }
            break;
    
        default:
        System.out.println("Opción no válida.");
            break;
    }
    
}
    leer.close();

    }
}
