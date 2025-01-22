package com.exercici0101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriu la teva edat: ");
        Integer edat = scanner.nextInt();
        Integer edatgos = edat*7;
        System.out.println("La teva edat en anys de gos són "+edatgos+" anys");
    }
}
