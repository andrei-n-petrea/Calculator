/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Laptop extends Calculator {
    private short baterie;
    private float greutate;
    private boolean areCamera;
    private String tipDisplay;
    private int rezolutieDisplay;
    private boolean areTastaturaIluminata;
    private ArrayList<Laptop> instantaVector = new ArrayList<>();

    public Laptop() {}

    public Laptop(String marca, String model, short baterie, float greutate, boolean areCamera, String tipDisplay, int rezolutieDisplay, boolean areTastaturaIluminata) {
        super(marca, model);
        this.baterie = baterie;
        this.greutate = greutate;
        this.areCamera = areCamera;
        this.tipDisplay = tipDisplay;
        this.rezolutieDisplay = rezolutieDisplay;
        this.areTastaturaIluminata = areTastaturaIluminata;
    }

    public Laptop(Laptop altLaptop) {
        super(altLaptop.getMarca(), altLaptop.getModel());
        this.baterie = altLaptop.baterie;
        this.greutate = altLaptop.greutate;
        this.areCamera = altLaptop.areCamera;
        this.tipDisplay = altLaptop.tipDisplay;
        this.rezolutieDisplay = altLaptop.rezolutieDisplay;
        this.areTastaturaIluminata = altLaptop.areTastaturaIluminata;
    }

    @Override
    public void pornire() {
        System.out.println("Laptopul " + getMarca() + " " + getModel() + " se pornește.");
    }

    @Override
    public void oprire() {
        System.out.println("Laptopul " + getMarca() + " " + getModel() + " se oprește.");
    }

    public short getBaterie() {
        return baterie;
    }

    public void setBaterie(short baterie) {
        this.baterie = baterie;
    }

    public float getGreutate() {
        return greutate;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    public boolean isAreCamera() {
        return areCamera;
    }

    public void setAreCamera(boolean areCamera) {
        this.areCamera = areCamera;
    }

    public String getTipDisplay() {
        return tipDisplay;
    }

    public void setTipDisplay(String tipDisplay) {
        this.tipDisplay = tipDisplay;
    }

    public int getRezolutieDisplay() {
        return rezolutieDisplay;
    }

    public void setRezolutieDisplay(int rezolutieDisplay) {
        this.rezolutieDisplay = rezolutieDisplay;
    }

    public boolean isAreTastaturaIluminata() {
        return areTastaturaIluminata;
    }

    public void setAreTastaturaIluminata(boolean areTastaturaIluminata) {
        this.areTastaturaIluminata = areTastaturaIluminata;
    }

    @Override
public ArrayList<Calculator> getInstantaVector() {
    return super.getInstantaVector();  
}

    public void creareVector() {
        for (int i = 0; i < 10; i++) {
            instantaVector.add(new Laptop(
                    "Marca" + (i + 1),
                    "Model" + (i + 1),
                    (short) (4000 + i * 100),
                    1.5f + i * 0.1f,
                    i % 2 == 0,
                    i % 2 == 0 ? "OLED" : "LCD",
                    1920 + i * 10,
                    i % 3 == 0
            ));
        }
    }

    public void afisareVector() {
        for (Laptop laptop : instantaVector) {
            System.out.println(laptop);
        }
    }

    public void afisareVectorConditieMarcaCeruta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti marca dorita: ");
        String marcaCautata = scanner.nextLine();

        for (Laptop laptop : instantaVector) {
            if (marcaCautata.equals(laptop.getMarca())) {
                System.out.println(laptop);
            }
        }
    }

    public void afisareVectorConditieModelCerut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti modelul dorit: ");
        String modelCautat = scanner.nextLine();

        for (Laptop laptop : instantaVector) {
            if (laptop.getModel().contains(modelCautat)) {
                System.out.println(laptop);
            }
        }
    }

    @Override
    
    public String toString() {
        return "Laptop [marca=" + getMarca() + ", model=" + getModel() + ", baterie=" + baterie + "mAh, greutate=" + greutate + "kg, " +
               "areCamera=" + areCamera + ", tipDisplay=" + tipDisplay + ", rezolutieDisplay=" + rezolutieDisplay + ", " +
               "areTastaturaIluminata=" + areTastaturaIluminata + "]";
    }
}
