package com.exercici0102;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriu un nombre: ");
        Integer nombre = scanner.nextInt();
        Integer doble = nombre*2;
        System.out.println("El doble és: "+ doble);
        Integer triple = nombre*3;
        System.out.println("El triple és: "+triple);
        Double meitat = nombre/ Double.parseDouble("2");
        System.out.println("La meitat és: "+meitat);
    }
}
