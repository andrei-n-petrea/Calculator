/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.calculator;

public class Laptop extends Calculator {
    private int diagonalaEcran;
    private int memorieRAM;
    private int capacitateStocare;
    private String tipProcesor;
    private boolean arePlacaVideoDed;
    private String sistemOperare;
    private AccesoriiLaptop accesoriu;

    public Laptop() {
        super();
    }

    public Laptop(String marca, String model, int diagonalaEcran, int memorieRAM, int capacitateStocare, String tipProcesor, boolean arePlacaVideoDed, String sistemOperare, AccesoriiLaptop accesoriu) {
        super(marca, model);
        this.diagonalaEcran = diagonalaEcran;
        this.memorieRAM = memorieRAM;
        this.capacitateStocare = capacitateStocare;
        this.tipProcesor = tipProcesor;
        this.arePlacaVideoDed = arePlacaVideoDed;
        this.sistemOperare = sistemOperare;
        this.accesoriu = accesoriu != null ? new AccesoriiLaptop(accesoriu) : null;
    }

    public Laptop(Laptop altLaptop) {
        super(altLaptop.getMarca(), altLaptop.getModel());
        this.diagonalaEcran = altLaptop.diagonalaEcran;
        this.memorieRAM = altLaptop.memorieRAM;
        this.capacitateStocare = altLaptop.capacitateStocare;
        this.tipProcesor = altLaptop.tipProcesor;
        this.arePlacaVideoDed = altLaptop.arePlacaVideoDed;
        this.sistemOperare = altLaptop.sistemOperare;
        this.accesoriu = altLaptop.accesoriu != null ? new AccesoriiLaptop(altLaptop.accesoriu) : null;
    }

  
    public void pornire() {
        System.out.println("Laptopul se pornește.");
    }

    
    public void oprire() {
        System.out.println("Laptopul se oprește.");
    }

    
    public String toString() {
        return super.toString() + ", Laptop [diagonalaEcran=" + diagonalaEcran + "\", memorieRAM=" + memorieRAM + " GB, capacitateStocare=" + capacitateStocare + " GB, tipProcesor=" + tipProcesor + ", arePlacaVideoDed=" + arePlacaVideoDed + ", sistemOperare=" + sistemOperare + ", accesoriu=" + (accesoriu != null ? accesoriu.toString() : "Niciun accesoriu") + "]";
    }

    public AccesoriiLaptop getAccesoriu() {
        return accesoriu;
    }

    public void setAccesoriu(AccesoriiLaptop accesoriu) {
        this.accesoriu = accesoriu;
    }

    public int getDiagonalaEcran() {
        return diagonalaEcran;
    }

    public void setDiagonalaEcran(int diagonalaEcran) {
        this.diagonalaEcran = diagonalaEcran;
    }

    public int getMemorieRAM() {
        return memorieRAM;
    }

    public void setMemorieRAM(int memorieRAM) {
        this.memorieRAM = memorieRAM;
    }

    public int getCapacitateStocare() {
        return capacitateStocare;
    }

    public void setCapacitateStocare(int capacitateStocare) {
        this.capacitateStocare = capacitateStocare;
    }

    public String getTipProcesor() {
        return tipProcesor;
    }

    public void setTipProcesor(String tipProcesor) {
        this.tipProcesor = tipProcesor;
    }

    public boolean isArePlacaVideoDed() {
        return arePlacaVideoDed;
    }

    public void setArePlacaVideoDed(boolean arePlacaVideoDed) {
        this.arePlacaVideoDed = arePlacaVideoDed;
    }

    public String getSistemOperare() {
        return sistemOperare;
    }

    public void setSistemOperare(String sistemOperare) {
        this.sistemOperare = sistemOperare;
    }
}
