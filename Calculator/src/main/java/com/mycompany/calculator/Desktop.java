/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;
/**
 *
 * @author HP
 */
public class Desktop extends Calculator {
    private byte capacitateRAM;  
    private int capacitateHDD;
    private String tipCarcasa;
    private String tipPlacaDeBaza;
    private boolean areMonitorInclus;

    public Desktop() {
        super();
    }

    public Desktop(String marca, String model, byte capacitateRAM, int capacitateHDD, String tipCarcasa, String tipPlacaDeBaza, boolean areMonitorInclus) {
        super(marca, model);
        this.capacitateRAM = capacitateRAM;
        this.capacitateHDD = capacitateHDD;
        this.tipCarcasa = tipCarcasa;
        this.tipPlacaDeBaza = tipPlacaDeBaza;
        this.areMonitorInclus = areMonitorInclus;
    }

    public Desktop(Desktop altDesktop) {
        super(altDesktop);
        this.capacitateRAM = altDesktop.capacitateRAM;
        this.capacitateHDD = altDesktop.capacitateHDD;
        this.tipCarcasa = altDesktop.tipCarcasa;
        this.tipPlacaDeBaza = altDesktop.tipPlacaDeBaza;
        this.areMonitorInclus = altDesktop.areMonitorInclus;
    }

    @Override
    public void pornire() {
        System.out.println("Desktopul se pornește.");
    }

    @Override
    public void oprire() {
        System.out.println("Desktopul se oprește.");
    }

    @Override
    public String toString() {
        return super.toString() + " [capacitateRAM=" + capacitateRAM + " GB, capacitateHDD=" + capacitateHDD +
                " GB, tipCarcasa=" + tipCarcasa + ", tipPlacaDeBaza=" + tipPlacaDeBaza +
                ", areMonitorInclus=" + areMonitorInclus + "]";
    }

    public byte getCapacitateRAM() {
        return capacitateRAM;
    }

    public void setCapacitateRAM(byte capacitateRAM) {
        this.capacitateRAM = capacitateRAM;
    }

    public int getCapacitateHDD() {
        return capacitateHDD;
    }

    public void setCapacitateHDD(int capacitateHDD) {
        this.capacitateHDD = capacitateHDD;
    }

    public String getTipCarcasa() {
        return tipCarcasa;
    }

    public void setTipCarcasa(String tipCarcasa) {
        this.tipCarcasa = tipCarcasa;
    }

    public String getTipPlacaDeBaza() {
        return tipPlacaDeBaza;
    }

    public void setTipPlacaDeBaza(String tipPlacaDeBaza) {
        this.tipPlacaDeBaza = tipPlacaDeBaza;
    }

    public boolean isAreMonitorInclus() {
        return areMonitorInclus;
    }

    public void setAreMonitorInclus(boolean areMonitorInclus) {
        this.areMonitorInclus = areMonitorInclus;
    }
}
