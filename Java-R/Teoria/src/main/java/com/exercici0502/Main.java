package com.exercici0502;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriu un numero: ");
        float numero1 = scanner.nextFloat();
        System.out.print("Escriu un numero: ");
        float numero2 = scanner.nextFloat();
        System.out.print("Escriu un numero: ");
        float numero3 = scanner.nextFloat();
        maxOfThree(numero1, numero2, numero3);
    }
    public static float maxOfThree(float a, float b, float c){
        float max = 0;
        if (a>max){
            max = a;
        }
        if (b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        System.out.println(max);
        return max;
    }
}
