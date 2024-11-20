/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;
/**
 *
 * @author HP
 */
import java.util.ArrayList;
public class Desktop extends Calculator {
    private byte ram;
    private short stocare;
    private String tipCarcasa;
    private String placaDeBaza;
    private boolean areMonitorInclus;
    private ArrayList<Desktop> instantaVector = new ArrayList<>();


    public Desktop() {}

    
    public Desktop(String marca, String model, byte ram, short stocare, String tipCarcasa, String placaDeBaza, boolean areMonitorInclus) {
        super(marca, model);
        this.ram = ram;
        this.stocare = stocare;
        this.tipCarcasa = tipCarcasa;
        this.placaDeBaza = placaDeBaza;
        this.areMonitorInclus = areMonitorInclus;
    }

    
    public Desktop(Desktop altDesktop) {
        super(altDesktop.getMarca(), altDesktop.getModel());
        this.ram = altDesktop.ram;
        this.stocare = altDesktop.stocare;
        this.tipCarcasa = altDesktop.tipCarcasa;
        this.placaDeBaza = altDesktop.placaDeBaza;
        this.areMonitorInclus = altDesktop.areMonitorInclus;
    }

    
    public byte getRam() {
        return ram;
    }

    public void setRam(byte ram) {
        this.ram = ram;
    }

    public short getStocare() {
        return stocare;
    }

    public void setStocare(short stocare) {
        this.stocare = stocare;
    }

    public String getTipCarcasa() {
        return tipCarcasa;
    }

    public void setTipCarcasa(String tipCarcasa) {
        this.tipCarcasa = tipCarcasa;
    }

    public String getPlacaDeBaza() {
        return placaDeBaza;
    }

    public void setPlacaDeBaza(String placaDeBaza) {
        this.placaDeBaza = placaDeBaza;
    }

    public boolean isAreMonitorInclus() {
        return areMonitorInclus;
    }

    public void setAreMonitorInclus(boolean areMonitorInclus) {
        this.areMonitorInclus = areMonitorInclus;
    }

    
    public void creareVector() {
        for (int i = 0; i < 10; i++) {
            instantaVector.add(new Desktop("Marca" + (i + 1), "Model" + (i + 1), (byte) (8 + i), (short) (256 + i * 10), "ATX", "Placa" + i, i % 2 == 0));
        }
    }

    public void afisareVector() {
        for (Desktop desktop : instantaVector) {
            System.out.println(desktop);
        }
    }

    public void afisareVectorConditie1() {
        for (Desktop desktop : instantaVector) {
            if ("Marca5".equals(desktop.getMarca())) {
                System.out.println(desktop);
            }
        }
    }

    public void afisareVectorConditie2() {
        for (Desktop desktop : instantaVector) {
            if (desktop.getModel().contains("Model7")) {
                System.out.println(desktop);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Desktop [ram=" + ram +
                ", stocare=" + stocare +
                ", tipCarcasa=" + tipCarcasa +
                ", placaDeBaza=" + placaDeBaza +
                ", areMonitorInclus=" + areMonitorInclus + "]";
    }
}
