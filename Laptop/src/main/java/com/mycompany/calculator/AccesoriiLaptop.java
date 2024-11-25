package com.mycompany.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class AccesoriiLaptop {
    private String numeAccesoriu;
    private double pret;
    private boolean wireless;
    private Laptop laptopCompatibil; 

    private static ArrayList<AccesoriiLaptop> vectorAccesoriiLaptop = new ArrayList<>();

    public AccesoriiLaptop() {}

    public AccesoriiLaptop(String numeAccesoriu, double pret, boolean wireless, Laptop laptopCompatibil) {
        this.numeAccesoriu = numeAccesoriu;
        this.pret = pret;
        this.wireless = wireless;
        this.laptopCompatibil = laptopCompatibil;
    }

    public AccesoriiLaptop(AccesoriiLaptop altAccesoriu) {
        this.numeAccesoriu = altAccesoriu.numeAccesoriu;
        this.pret = altAccesoriu.pret;
        this.wireless = altAccesoriu.wireless;
        this.laptopCompatibil = altAccesoriu.laptopCompatibil;
    }

    public String getNumeAccesoriu() {
        return numeAccesoriu;
    }

    public void setNumeAccesoriu(String numeAccesoriu) {
        this.numeAccesoriu = numeAccesoriu;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public Laptop getLaptopCompatibil() {
        return laptopCompatibil;
    }

    public void setLaptopCompatibil(Laptop laptopCompatibil) {
        this.laptopCompatibil = laptopCompatibil;
    }

    public void creareVector(Laptop laptop) {
        String[] tipuri = {"Mouse", "Tastatura", "Suport", "Rucsac", "Docking Station"};
        for (int i = 0; i < 10; i++) {
            vectorAccesoriiLaptop.add(new AccesoriiLaptop(
                   "Accesoriu" + (i + 1),
                   50.0 + i * 10,
                   i % 2 == 0,
                   laptop
            ));
        }
    }

    public void afisareVector() {
        for (AccesoriiLaptop accesoriu : vectorAccesoriiLaptop) {
            System.out.println(accesoriu);
        }
    }

    public void afisareVectorConditieMarcaCompatibila() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți numele accesoriului compatibil: ");
        String marcaCautata = scanner.nextLine();

        for (AccesoriiLaptop accesoriu : vectorAccesoriiLaptop) {
            if (accesoriu.getLaptopCompatibil().getMarca().equalsIgnoreCase(marcaCautata)) {
                System.out.println(accesoriu);
            }
        }
    }

    public void afisareVectorConditieWireless() {
        System.out.println("Accesorii wireless disponibile:");
        for (AccesoriiLaptop accesoriu : vectorAccesoriiLaptop) {
            if (accesoriu.isWireless()) {
                System.out.println(accesoriu);
            }
        }
    }

    @Override
    public String toString() {
        return "AccesoriiLaptop [Nume=" + numeAccesoriu + ", Pret=" + pret + " RON, Wireless=" + wireless + 
               ", LaptopCompatibil=" + laptopCompatibil + "]";
    }
}