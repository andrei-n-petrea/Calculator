/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Test Calculator ---");
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator("Lenovo", "ThinkPad");
        Calculator calc3 = new Calculator(calc2);

        System.out.println("Calculator 1 (fara argumente): " + calc1);
        System.out.println("Calculator 2 (cu argumente): " + calc2);
        System.out.println("Calculator 3 (copie): " + calc3);
        System.out.println();

        calc2.creareVector();
        System.out.println("Vectorul de Calculatoare creat:");
        calc2.afisareVector();

        System.out.println("\nFiltrare Calculatoare dupa marca introdusa:");
        calc2.afisareVectorConditieMarcaCeruta();

        System.out.println("\nFiltrare Calculatoare dupa modelul introdus:");
        calc2.afisareVectorConditieModelCerut();
        System.out.println();

        System.out.println("--- Test Laptop ---");
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop("HP", "Pavilion", (short) 4000, 1.8f, true, "IPS", 1920, true);
        Laptop laptop3 = new Laptop(laptop2);

        System.out.println("Laptop 1 (fara argumente): " + laptop1);
        System.out.println("Laptop 2 (cu argumente): " + laptop2);
        System.out.println("Laptop 3 (copie): " + laptop3);
        System.out.println();

        laptop2.creareVector();
        System.out.println("Vectorul de Laptop-uri creat:");
        laptop2.afisareVector();

        System.out.println("\nFiltrare Laptop-uri dupa marca introdusa:");
        laptop2.afisareVectorConditieMarcaCeruta();

        System.out.println("\nFiltrare Laptop-uri dupa modelul introdus:");
        laptop2.afisareVectorConditieModelCerut();
        System.out.println();

        System.out.println("--- Test AccesoriiLaptop ---");
        AccesoriiLaptop accesoriu1 = new AccesoriiLaptop();
        AccesoriiLaptop accesoriu2 = new AccesoriiLaptop("Mouse", "Logitech", 75.0f, true);
        AccesoriiLaptop accesoriu3 = new AccesoriiLaptop(accesoriu2);

        System.out.println("AccesoriiLaptop 1 (fara argumente): " + accesoriu1);
        System.out.println("AccesoriiLaptop 2 (cu argumente): " + accesoriu2);
        System.out.println("AccesoriiLaptop 3 (copie): " + accesoriu3);
        System.out.println();

        accesoriu2.creareVector();
        System.out.println("Vectorul de AccesoriiLaptop creat:");
        accesoriu2.afisareVector();

        System.out.println("\nFiltrare AccesoriiLaptop dupa marca introdusa:");
        accesoriu2.afisareVectorConditieMarcaCeruta();

        System.out.println("\nFiltrare AccesoriiLaptop dupa tipul introdus:");
        accesoriu2.afisareVectorConditieTipAccesoriu();
    }
}