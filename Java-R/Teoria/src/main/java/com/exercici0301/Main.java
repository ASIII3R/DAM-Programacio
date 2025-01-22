package com.exercici0301;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu un nom");
        String nom1 = scanner.nextLine().toLowerCase();
        System.out.println("Escriu un nom");
        String nom2 = scanner.nextLine().toLowerCase();

        if (nom1.equals(nom2)){
            System.out.println(nom1+" i "+nom2+" són iguals");
        }else{
            System.out.println("NOOOOOOOOO");
        }

    }
}
