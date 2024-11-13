/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

/**
 *
 * @author HP
 */

public abstract class Calculator {
    protected String marca;
    protected String model;

    // Constructor fără argumente
    public Calculator() {}

    // Constructor cu toate argumentele
    public Calculator(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    // Constructor de copiere
    public Calculator(Calculator altCalculator) {
        this.marca = altCalculator.marca;
        this.model = altCalculator.model;
    }

    // Metode abstracte
    public abstract void pornire();
    public abstract void oprire();

    // Getteri și Setteri
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Metodă toString
    public String toString() {
        return "Calculator [marca=" + marca + ", model=" + model + "]";
    }
}