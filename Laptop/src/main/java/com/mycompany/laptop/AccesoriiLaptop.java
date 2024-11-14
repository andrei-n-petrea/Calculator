/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

public class AccesoriiLaptop {
    private String tipAccesoriu;
    private double pret;

    public AccesoriiLaptop() {}

    public AccesoriiLaptop(String tipAccesoriu, double pret) {
        this.tipAccesoriu = tipAccesoriu;
        this.pret = pret;
    }

    public AccesoriiLaptop(AccesoriiLaptop altAccesoriu) {
        this.tipAccesoriu = altAccesoriu.tipAccesoriu;
        this.pret = altAccesoriu.pret;
    }

    public String getTipAccesoriu() {
        return tipAccesoriu;
    }

    public void setTipAccesoriu(String tipAccesoriu) {
        this.tipAccesoriu = tipAccesoriu;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

   
    public String toString() {
        return "AccesoriiLaptop [tipAccesoriu=" + tipAccesoriu + ", pret=" + pret + "]";
    }
}
