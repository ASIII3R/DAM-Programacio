package com.exercici0209;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        boolean tof = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriu un número: ");
        int numero = scanner.nextInt();

        if (numero >0){
            tof = true;
        }

        System.out.println(tof);
    }
}
