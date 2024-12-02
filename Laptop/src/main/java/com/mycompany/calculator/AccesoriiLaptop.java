package com.mycompany.calculator;

public class AccesoriiLaptop {
    private String numeAccesoriu;
    private double pret;
    private boolean wireless;
    private Laptop laptopCompatibil; 

   

    public AccesoriiLaptop() {}

    public AccesoriiLaptop(String numeAccesoriu, double pret, boolean wireless, Laptop laptopCompatibil) {
        this.numeAccesoriu = numeAccesoriu;
        this.pret = pret;
        this.wireless = wireless;
        this.laptopCompatibil = laptopCompatibil;
    }

    public AccesoriiLaptop(AccesoriiLaptop altAccesoriu) {
        this.numeAccesoriu = altAccesoriu.numeAccesoriu;
        this.pret = altAccesoriu.pret;
        this.wireless = altAccesoriu.wireless;
        this.laptopCompatibil = altAccesoriu.laptopCompatibil;
    }

    public String getNumeAccesoriu() {
        return numeAccesoriu;
    }

    public void setNumeAccesoriu(String numeAccesoriu) {
        this.numeAccesoriu = numeAccesoriu;
    }

   
    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

   
    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

  
    public Laptop getLaptopCompatibil() {
        return laptopCompatibil;
    }

    public void setLaptopCompatibil(Laptop laptopCompatibil) {
        this.laptopCompatibil = laptopCompatibil;
    }

 
    @Override
    public String toString() {
        return "AccesoriiLaptop [Nume=" + numeAccesoriu + ", Pret=" + pret + " RON, Wireless=" + wireless + 
               ", LaptopCompatibil=" + laptopCompatibil + "]";
    }
}