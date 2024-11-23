/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Desktop extends Calculator{
    private byte ram; 
    private short stocare; 
    private String formatCarcasa; 
    private String placaDeBaza; 
    private boolean placaVideoDedicate; 
    private ArrayList<Desktop> instantaVector = new ArrayList<>();

  
    public Desktop() {
        super(); 
    }

    public Desktop(String marca, String model, byte ram, short stocare, String formatCarcasa, String placaDeBaza, boolean placaVideoDedicate) {
        super(marca, model); 
        this.ram = ram;
        this.stocare = stocare;
        this.formatCarcasa = formatCarcasa;
        this.placaDeBaza = placaDeBaza;
        this.placaVideoDedicate = placaVideoDedicate;
    }

    public Desktop(Desktop altDesktop) {
        super(altDesktop); 
        this.ram = altDesktop.ram;
        this.stocare = altDesktop.stocare;
        this.formatCarcasa = altDesktop.formatCarcasa;
        this.placaDeBaza = altDesktop.placaDeBaza;
        this.placaVideoDedicate = altDesktop.placaVideoDedicate;
    }


    @Override
    public void pornire() {
        System.out.println("Desktop-ul se pornește.");
    }

    @Override
    public void oprire() {
        System.out.println("Desktop-ul se oprește.");
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

    public String getFormatCarcasa() {
        return formatCarcasa;
    }

    public void setFormatCarcasa(String formatCarcasa) {
        this.formatCarcasa = formatCarcasa;
    }

    public String getPlacaDeBaza() {
        return placaDeBaza;
    }

    public void setPlacaDeBaza(String placaDeBaza) {
        this.placaDeBaza = placaDeBaza;
    }

    public boolean isPlacaVideoDedicate() {
        return placaVideoDedicate;
    }

    public void setPlacaVideoDedicate(boolean placaVideoDedicate) {
        this.placaVideoDedicate = placaVideoDedicate;
    }

    public ArrayList<Desktop> getVectorDesktop() {
        return instantaVector;}

    public void creareVector() {
        for (int i = 0; i < 10; i++) {
            instantaVector.add(new Desktop("Marca" + (i + 1), "Model" + (i + 1), (byte) (8 + i), (short) (500 + i * 50), "ATX", "MSI", true));
        }
    }

    public void afisareVector() {
        for (Desktop desktop : instantaVector) {
            System.out.println(desktop);
        }
    }

    public void afisareVectorConditieMarcaCeruta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti marca dorita: ");
        String marcaCautata = scanner.nextLine();
        
        for (Desktop desktop : instantaVector) {
            if (marcaCautata.equals(desktop.getMarca())) {
                System.out.println(desktop);
            }
        }
    }

    public void afisareVectorConditieModelCerut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti modelul dorit: ");
        String modelCautat = scanner.nextLine();
        
        for (Desktop desktop : instantaVector) {
            if (desktop.getModel().contains(modelCautat)) {
                System.out.println(desktop);
            }
        }
    }

   
    @Override
    public String toString() {
        return "Desktop [marca=" + getMarca() + ", model=" + getModel() + ", ram=" + ram + "GB, stocare=" + stocare + "GB, " +
               "formatCarcasa=" + formatCarcasa + ", placaDeBaza=" + placaDeBaza + ", placaVideoDedicate=" + placaVideoDedicate + "]";
    }
}
