/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author HP
 */


public class Server extends Calculator {
    private int stocare;
    private String procesor;
    private String tipRetea;
    private String sistemOperare;
    private int vitezaInternet;

    // Constructor fără argumente
    public Server() {
        super();
    }

    // Constructor cu toate argumentele
    public Server(String marca, String model, int stocare, String procesor, String tipRetea, String sistemOperare, int vitezaInternet) {
        super(marca, model);
        this.stocare = stocare;
        this.procesor = procesor;
        this.tipRetea = tipRetea;
        this.sistemOperare = sistemOperare;
        this.vitezaInternet = vitezaInternet;
    }

    // Constructor de copiere
    public Server(Server altServer) {
        super(altServer);
        this.stocare = altServer.stocare;
        this.procesor = altServer.procesor;
        this.tipRetea = altServer.tipRetea;
        this.sistemOperare = altServer.sistemOperare;
        this.vitezaInternet = altServer.vitezaInternet;
    }

    // Metode abstracte
    
    public void pornire() {
        System.out.println("Serverul se pornește.");
    }

   
    public void oprire() {
        System.out.println("Serverul se oprește.");
    }

    // Metoda toString
 
    public String toString() {
        return "Server [marca=" + getMarca() + ", model=" + getModel() + ", stocare=" + stocare + " GB, procesor=" + procesor + ", tipRetea=" + tipRetea + ", sistemOperare=" + sistemOperare + ", vitezaInternet=" + vitezaInternet + " Mbps]";
    }

    // Getteri și Setteri
    public int getStocare() {
        return stocare;
    }

    public void setStocare(int stocare) {
        this.stocare = stocare;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getTipRetea() {
        return tipRetea;
    }

    public void setTipRetea(String tipRetea) {
        this.tipRetea = tipRetea;
    }

    public String getSistemOperare() {
        return sistemOperare;
    }

    public void setSistemOperare(String sistemOperare) {
        this.sistemOperare = sistemOperare;
    }

    public int getVitezaInternet() {
        return vitezaInternet;
    }

    public void setVitezaInternet(int vitezaInternet) {
        this.vitezaInternet = vitezaInternet;
    }
}