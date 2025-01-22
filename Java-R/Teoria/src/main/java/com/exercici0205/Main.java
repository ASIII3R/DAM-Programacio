package com.exercici0205;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        boolean tof = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriu un número: ");
        int numero = scanner.nextInt();

        System.out.print("Escriu un número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Escriu el valor que vulguis buscar: ");
        int valor = scanner.nextInt();

        if ((valor <= numero && valor >= numero2)|| (valor >= numero && valor <= numero2)){
             tof = true;
        }
        System.out.println(tof);
    }
}
