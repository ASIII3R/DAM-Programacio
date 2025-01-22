package com.exercici0200;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;
        System.out.println("El valor de π és: " + pi);

        System.out.print("Àrea del teu cercle: ");
        Integer numero = scanner.nextInt();

        double area = pi*(numero*numero);
        System.out.println("El àrea és: "+ area);
    }
}
