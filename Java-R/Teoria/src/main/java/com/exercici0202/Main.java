package com.exercici0202;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserta el preu original: ");
        double preu = scanner.nextDouble();
        System.out.print("Inserta el % de descompte: ");
        Integer descompte = scanner.nextInt();

        Double preuFinal = preu-((preu*descompte)/100);
        System.out.println("El preu final és: "+preuFinal);

    }
}
