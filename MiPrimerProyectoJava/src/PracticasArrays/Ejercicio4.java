package PracticasArrays;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double numeros []= new double[10];
        int num = 0;
        byte contador = 0;
        for(int i = 0; i<10 ;i++){
            System.out.print("Introdusca un numero : ");
            num = leer.nextInt();
            if (num>=0){
                numeros[i]=num;
                contador ++;
            }else{
                i= 9;
            }
        }
        for(int i = 0; i<contador ;i++){
            System.out.println((int)numeros[i]);
        }
        leer.close();
    }
}
