package com.exercici0201;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriu una temperatura: ");
        int temp = scanner.nextInt();

        double fahrenheit = (temp* 9/5)+32;
        System.out.println("La temperatura en fahrenheit és: "+ fahrenheit);

        scanner.close();
    }
}
