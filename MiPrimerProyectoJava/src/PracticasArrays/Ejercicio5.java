package PracticasArrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        Random numerosRandom = new Random();
        double vector []= new double[10];
        for(int i = 0; i<10 ;i++){
            vector[i]=numerosRandom.nextInt(20);
        }

        System.out.println("---------------");
        System.out.println("vector original");
        for(int i = 0; i<10 ;i++){
            System.out.println((int)vector[i]);
        }
        System.out.println("---------------");
        
        Arrays.sort(vector);

        for (int i = 0; i < 10; i++) {
            System.out.println((int)vector[i]);
        }
    }
}
