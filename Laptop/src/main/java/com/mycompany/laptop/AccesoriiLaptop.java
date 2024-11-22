/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class AccesoriiLaptop {
    private String tipAccesoriu;
    private String marca;
    private float pret;
    private boolean compatibilitateGaming;
    private ArrayList<AccesoriiLaptop> instantaVector = new ArrayList<>();

    public AccesoriiLaptop() {}

    public AccesoriiLaptop(String tipAccesoriu, String marca, float pret, boolean compatibilitateGaming) {
        this.tipAccesoriu = tipAccesoriu;
        this.marca = marca;
        this.pret = pret;
        this.compatibilitateGaming = compatibilitateGaming;
    }

    public AccesoriiLaptop(AccesoriiLaptop altAccesoriu) {
        this.tipAccesoriu = altAccesoriu.tipAccesoriu;
        this.marca = altAccesoriu.marca;
        this.pret = altAccesoriu.pret;
        this.compatibilitateGaming = altAccesoriu.compatibilitateGaming;
    }

    public String getTipAccesoriu() {
        return tipAccesoriu;
    }

    public void setTipAccesoriu(String tipAccesoriu) {
        this.tipAccesoriu = tipAccesoriu;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public boolean isCompatibilitateGaming() {
        return compatibilitateGaming;
    }

    public void setCompatibilitateGaming(boolean compatibilitateGaming) {
        this.compatibilitateGaming = compatibilitateGaming;
    }

    public ArrayList<AccesoriiLaptop> getInstantaVector() {
        return instantaVector;
    }

    public void creareVector() {
        String[] tipuri = {"Mouse", "Tastatura", "Suport", "Rucsac", "Docking Station"};
        for (int i = 0; i < 10; i++) {
            instantaVector.add(new AccesoriiLaptop(
                    tipuri[i % tipuri.length],
                    "Marca" + (i + 1),
                    50 + i * 10,
                    i % 2 == 0
            ));
        }
    }

    public void afisareVector() {
        for (AccesoriiLaptop accesoriu : instantaVector) {
            System.out.println(accesoriu);
        }
    }

    public void afisareVectorConditieMarcaCeruta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti marca dorita: ");
        String marcaCautata = scanner.nextLine();

        for (AccesoriiLaptop accesoriu : instantaVector) {
            if (marcaCautata.equals(accesoriu.getMarca())) {
                System.out.println(accesoriu);
            }
        }
    }

    public void afisareVectorConditieTipAccesoriu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti tipul accesoriului dorit: ");
        String tipCautat = scanner.nextLine();

        for (AccesoriiLaptop accesoriu : instantaVector) {
            if (accesoriu.getTipAccesoriu().contains(tipCautat)) {
                System.out.println(accesoriu);
            }
        }
    }

    @Override
    public String toString() {
        return "AccesoriiLaptop [tipAccesoriu=" + tipAccesoriu +
                ", marca=" + marca +
                ", pret=" + pret +
                ", compatibilitateGaming=" + compatibilitateGaming + "]";
    }
}