/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculator;
/**
 *
 * @author HP
 */
import java.util.ArrayList;  // Pentru ArrayList

public class Calculator implements OperatiuniCalculator {
    private String marca;
    private String model;
    private ArrayList<Object> instantaVector = new ArrayList<>();

    public Calculator() {}

    public Calculator(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public Calculator(Calculator altCalculator) {
        this.marca = altCalculator.marca;
        this.model = altCalculator.model;
    }

    @Override
    public void pornire() {
        System.out.println("Calculatorul general se pornește.");
    }

    @Override
    public void oprire() {
        System.out.println("Calculatorul general se oprește.");
    }

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

    public ArrayList<Object> getInstantaVector() {
        return instantaVector;
    }

    public void setInstantaVector(ArrayList<Object> instantaVector) {
        this.instantaVector = instantaVector;
    }

    @Override
    public String toString() {
        return "Calculator [marca=" + marca + ", model=" + model + "]";
    }
}