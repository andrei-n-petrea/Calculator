package com.mycompany.calculator;

public class Laptop extends Calculator {
    private float diagonalaEcran;
    private int durataBaterie;
    private boolean touchScreen;
    private String rezolutieEcran;
    private String sistemOperare;

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

    @Override
    public String toString() {
        return "Laptop [Marca=" + getMarca() + ", Model=" + getModel() + ", Diagonala=" + diagonalaEcran +
               " inch, Durata Baterie=" + durataBaterie + " ore, TouchScreen=" + touchScreen +
               ", Rezolutie=" + rezolutieEcran + ", Sistem Operare=" + sistemOperare + "]";
    }
}