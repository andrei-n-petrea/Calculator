package com.mycompany.calculator;
import java.util.Scanner;
import java.util.ArrayList;
public class Calculator implements OperatiuniCalculator {
    private String marca;
    private String model;
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
        System.out.println("Calculatorul general se porneste.");
    }
    @Override
    public void oprire() {
        System.out.println("Calculatorul general se opreste.");
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
    @Override
    public String toString() {
        return "Calculator [Marca=" + marca + ", Model=" + model + "]";
    }
}
