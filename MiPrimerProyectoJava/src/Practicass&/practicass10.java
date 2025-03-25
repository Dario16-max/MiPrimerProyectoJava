
import java.util.Scanner;
public class practicass10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese su sueldo ");
        double sueldo = leer.nextDouble();
        System.out.println("ingrse sus años en la empresa ");
        int años = leer.nextInt();

        if (sueldo < 500 && años >= 10 ){sueldo += sueldo * 0.2;
            System.out.println("tuvo un aumento del 20% por lo que su sueldo total es de: "+sueldo);
        }
        else if (sueldo < 500 && años < 10 ){sueldo += sueldo * 0.05;
            System.out.println("tuvo un aumento del 5% por lo que su sueldo total es de: "+sueldo);
        }
        else if (sueldo >= 500 ){System.out.println("no tuvo aumento su sueldo total es de: "+sueldo);}
    
        leer.close();
    }
}