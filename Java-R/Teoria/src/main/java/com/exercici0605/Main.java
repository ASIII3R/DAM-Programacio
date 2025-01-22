package com.exercici0605;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        
        HashMap<String, Double> mapa = new HashMap<>();
        mapa.put("Anna",8.5);
        mapa.put("Joan",9.0);
        mapa.put("Maria",7.8);
        System.out.println("Nota de l'anna: "+ mapa.get("Anna"));
        System.out.println("Nota de Joan: "+ mapa.get("Joan"));
        System.out.println("Nota de María: "+ mapa.get("Maria"));

    }
}
