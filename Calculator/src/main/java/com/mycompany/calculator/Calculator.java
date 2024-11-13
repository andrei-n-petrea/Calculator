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
    public Calculator() {}
    public Calculator(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }
    public Calculator(Calculator altCalculator) {
        this.marca = altCalculator.marca;
        this.model = altCalculator.model;
    }
    public abstract void pornire();
    public abstract void oprire();

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
    public String toString() {
        return "Calculator [marca=" + marca + ", model=" + model + "]";
    }
}