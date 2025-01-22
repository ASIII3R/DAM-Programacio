package com.exercici0402;

public class Main {
    public static void main(String[] args) {
        
        calcularImpost(1000, 21);
    }
    public static double calcularImpost(double preu, double percentatge){
        double preufinal = preu+(preu*(percentatge/100));
        System.out.print(preufinal);
        return preufinal;
    }
}
