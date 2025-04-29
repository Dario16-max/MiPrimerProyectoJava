package PracticasArrays;

import java.util.Random;

public class Ejercicio1 {

    public static void main(String[] args) {
        int vectorNumeros [] =new int[10];
    Random numerosRamdom = new Random();
    for (int i = 0; i<vectorNumeros.length ;i++){
        vectorNumeros[i]= numerosRamdom.nextInt(10)+1;
    }
    for (int i = 0; i<vectorNumeros.length ;i++){
        System.out.println("el cuadrado del numero : "+vectorNumeros[i]+" es "+(vectorNumeros[i]*vectorNumeros[i]));
        System.out.println("el cubo del numero : "+vectorNumeros[i]+" es "+(vectorNumeros[i]*vectorNumeros[i]*vectorNumeros[i]));
    }
    }
}