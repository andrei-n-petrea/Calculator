/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator implements OperatiuniCalculator {
    private String marca;
    private String model;
    private ArrayList<Calculator> instantaVector = new ArrayList<>();

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

    public ArrayList<Calculator> getInstantaVector() {
        return instantaVector;
    }

    public void creareVector() {
        for (int i = 0; i < 10; i++) {
            instantaVector.add(new Calculator("Marca" + (i + 1), "Model" + (i + 1)));
        }
    }

    public void afisareVector() {
        for (Calculator calc : instantaVector) {
            System.out.println(calc);
        }
    }

    public void afisareVectorConditieMarcaCeruta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti marca dorita: ");
        String marcaCautata = scanner.nextLine();
        
        for (Calculator calc : instantaVector) {
            if (marcaCautata.equals(calc.getMarca())) {
                System.out.println(calc);
            }
        }
    }

    public void afisareVectorConditieModelCerut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti modelul dorit: ");
        String modelCautat = scanner.nextLine();
        
        for (Calculator calc : instantaVector) {
            if (calc.getModel().contains(modelCautat)) {
                System.out.println(calc);
            }
        }
    }

    @Override
    public String toString() {
        return "Calculator [marca=" + marca + ", model=" + model + "]";
    }
}