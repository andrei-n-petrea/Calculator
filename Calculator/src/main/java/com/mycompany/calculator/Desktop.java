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
    private byte memorieRAM;
    private short capacitateHDD;
    private String tipCarcasa;
    private String tipPlacaDeBaza;
    private boolean areMonitorInclus;
    private ArrayList<Object> instantaVector = new ArrayList<>();

    public Desktop() {
        super();
    }

    public Desktop(String marca, String model, byte memorieRAM, short capacitateHDD, String tipCarcasa, String tipPlacaDeBaza, boolean areMonitorInclus) {
        super(marca, model);
        this.memorieRAM = memorieRAM;
        this.capacitateHDD = capacitateHDD;
        this.tipCarcasa = tipCarcasa;
        this.tipPlacaDeBaza = tipPlacaDeBaza;
        this.areMonitorInclus = areMonitorInclus;
    }

    public Desktop(Desktop altDesktop) {
        super(altDesktop);
        this.memorieRAM = altDesktop.memorieRAM;
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
        return super.toString() + " [memorieRAM=" + memorieRAM + " GB, capacitateHDD=" + capacitateHDD +
                " GB, tipCarcasa=" + tipCarcasa + ", tipPlacaDeBaza=" + tipPlacaDeBaza +
                ", areMonitorInclus=" + areMonitorInclus + "]";
    }

    // Getter și setter pentru instantaVector
    public ArrayList<Object> getInstantaVector() {
        return instantaVector;
    }

    public void setInstantaVector(ArrayList<Object> instantaVector) {
        this.instantaVector = instantaVector;
    }

    // Getter și setter pentru celelalte variabile
    public byte getMemorieRAM() {
        return memorieRAM;
    }

    public void setMemorieRAM(byte memorieRAM) {
        this.memorieRAM = memorieRAM;
    }

    public short getCapacitateHDD() {
        return capacitateHDD;
    }

    public void setCapacitateHDD(short capacitateHDD) {
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
