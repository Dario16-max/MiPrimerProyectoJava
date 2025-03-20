import java.util.Scanner;
public class practicass {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos numero: ");
        double num1 = leer.nextInt();
        double num2 = leer.nextInt();
        if (num1 > num2 ){
            double sum = num1 + num2;
            double res = num1 - num2;
            System.out.println("el resultado de la suma es: " + sum);
            System.out.println("el resultado de la diferencia es:" + res);
        } else {
            double mul = num1 * num2;
            double div = num1 / num2;
            System.out.println("el resultao de la multiplicacion es: " + mul);
            System.out.println("el resultado de la division es: " + div);}

    leer.close();  
    }
    }
