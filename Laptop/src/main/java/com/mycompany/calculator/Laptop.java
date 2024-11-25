package com.mycompany.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Laptop extends Calculator {
    private float diagonalaEcran;
    private int durataBaterie;
    private boolean touchScreen;
    private String rezolutieEcran;
    private String sistemOperare;

    private ArrayList<Laptop> vectorLaptopuri = new ArrayList<>();

    public Laptop() {}

    public Laptop(String marca, String model, float diagonalaEcran, int durataBaterie, 
                  boolean touchScreen, String rezolutieEcran, String sistemOperare) {
        super(marca, model);
        this.diagonalaEcran = diagonalaEcran;
        this.durataBaterie = durataBaterie;
        this.touchScreen = touchScreen;
        this.rezolutieEcran = rezolutieEcran;
        this.sistemOperare = sistemOperare;
    }
    
    public Laptop(Laptop altLaptop) {
        super(altLaptop.getMarca(), altLaptop.getModel());
        this.diagonalaEcran = altLaptop.diagonalaEcran;
        this.durataBaterie = altLaptop.durataBaterie;
        this.touchScreen = altLaptop.touchScreen;
        this.rezolutieEcran = altLaptop.rezolutieEcran;
        this.sistemOperare = altLaptop.sistemOperare;
    }

    public float getDiagonalaEcran() {
        return diagonalaEcran;
    }

    public void setDiagonalaEcran(float diagonalaEcran) {
        this.diagonalaEcran = diagonalaEcran;
    }

    public int getDurataBaterie() {
        return durataBaterie;
    }

    public void setDurataBaterie(int durataBaterie) {
        this.durataBaterie = durataBaterie;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public String getRezolutieEcran() {
        return rezolutieEcran;
    }

    public void setRezolutieEcran(String rezolutieEcran) {
        this.rezolutieEcran = rezolutieEcran;
    }

    public String getSistemOperare() {
        return sistemOperare;
    }

    public void setSistemOperare(String sistemOperare) {
        this.sistemOperare = sistemOperare;
    }

    public void creareVector() {
        for (int i = 0; i < 10; i++) {
            vectorLaptopuri.add(new Laptop(
                "Marca" + (i + 1),
                "Model" + (i + 1),
                13.3f + i,
                6 + i,
                i % 2 == 0,
                "1920x1080",
                "Windows 10"
            ));
        }
    }

    public void afisareVector() {
        for (Laptop laptop : vectorLaptopuri) {
            System.out.println(laptop);
        }
    }

    public void afisareVectorConditieDiagonala() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti diagonala minima dorita: ");
        float diagonalaMinima = scanner.nextFloat();

        for (Laptop laptop : vectorLaptopuri) {
            if (laptop.getDiagonalaEcran() >= diagonalaMinima) {
                System.out.println(laptop);
            }
        }
    }

    public void afisareVectorConditieDurata() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti durata minima a bateriei (ore): ");
        int durataMinima = scanner.nextInt();

        for (Laptop laptop : vectorLaptopuri) {
            if (laptop.getDurataBaterie() >= durataMinima) {
                System.out.println(laptop);
            }
        }
    }

    @Override
    public String toString() {
        return "Laptop [Marca=" + getMarca() + ", Model=" + getModel() + ", Diagonala=" + diagonalaEcran +
               " inch, Durata Baterie=" + durataBaterie + " ore, TouchScreen=" + touchScreen +
               ", Rezolutie=" + rezolutieEcran + ", Sistem Operare=" + sistemOperare + "]";
    }
}